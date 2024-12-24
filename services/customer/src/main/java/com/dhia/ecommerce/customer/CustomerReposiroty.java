package com.dhia.ecommerce.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerReposiroty extends MongoRepository<Customer,String> {


}
