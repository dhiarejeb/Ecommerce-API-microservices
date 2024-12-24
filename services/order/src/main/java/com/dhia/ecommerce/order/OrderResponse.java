package com.dhia.ecommerce.order;

import java.math.BigDecimal;

public record OrderResponse(
        Integer id ,
        String reference,
        BigDecimal total_amount,
        PaymentMethod paymentMethod,
        String customerId


) {
}
