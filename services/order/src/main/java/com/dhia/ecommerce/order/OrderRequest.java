package com.dhia.ecommerce.order;



import com.dhia.ecommerce.product.PurchaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

public record OrderRequest(
        Integer id,
        String reference,
        @Positive(message = "amount need to be positive")
        BigDecimal totalAmount,
        @NotNull(message = "you need to mention payment method")
        PaymentMethod paymentMethod,
        @NotNull
        @NotEmpty
        @NotBlank
        String customerId,
        @NotEmpty
        List<PurchaseRequest> products
) {
}
