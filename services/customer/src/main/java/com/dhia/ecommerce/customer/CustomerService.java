package com.dhia.ecommerce.customer;

import com.dhia.ecommerce.exception.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerReposiroty customerReposiroty;
    private final CustomerMapper mapper;

    public String createCustomer(CustomerRequest request) {
        var customer = customerReposiroty.save(mapper.toCustomer(request));
        return customer.getId();
    }

    public void updateCustomer(CustomerRequest request) {
        var customer = customerReposiroty.findById(request.id())
                .orElseThrow(() -> new CustomerNotFoundException(
                        String.format("cannot update customer :: customer not found with id :: %s", request.id())
                ));
        mergeCustomer(customer,request);
        customerReposiroty.save(customer);
    }

    private void mergeCustomer(Customer customer, CustomerRequest request) {
        if(StringUtils.isNotBlank(request.firstName())){
            customer.setFirstName(request.firstName());
        }if(StringUtils.isNotBlank(request.lastName())){
            customer.setLastName(request.lastName());
        }if(StringUtils.isNotBlank(request.email())){
            customer.setEmail(request.email());
        }if(request.adress() != null){
            customer.setAdress(request.adress());
        }
    }

    public List<CustomerResponse> findAllCustomers() {
        return customerReposiroty.findAll()
                .stream()
                .map(mapper::fromCustomer)
                .collect(Collectors.toList());

    }

    public Boolean existById(String customerId) {
        return customerReposiroty.findById(customerId)
                .isPresent();
    }


    public CustomerResponse findById(String customerId) {
        return customerReposiroty.findById(customerId)
                .map(mapper::fromCustomer)
                .orElseThrow(() -> new CustomerNotFoundException(String.format("cannot find customer with id = :: %s", customerId)));

    }

    public void deleteCustomer(String customerId) {
        customerReposiroty.deleteById(customerId);
    }
}
