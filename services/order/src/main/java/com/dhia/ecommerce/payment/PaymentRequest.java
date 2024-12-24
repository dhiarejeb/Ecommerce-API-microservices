package com.dhia.ecommerce.payment;

import com.dhia.ecommerce.customer.CustomerResponse;
import com.dhia.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
