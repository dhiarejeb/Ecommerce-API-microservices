package com.dhia.ecommerce.kafka;


import com.dhia.ecommerce.customer.CustomerResponse;
import com.dhia.ecommerce.order.PaymentMethod;
import com.dhia.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference ,
        BigDecimal totalAmount ,
        PaymentMethod paymentMethod,
        CustomerResponse customerResponse,
        List<PurchaseResponse> products
) {
}
