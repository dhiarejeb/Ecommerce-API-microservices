package com.dhia.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PurchaseRequest(
        @NotNull(message = "")
        Integer productId,
        @Positive(message = "")
        double quantity
) {
}
