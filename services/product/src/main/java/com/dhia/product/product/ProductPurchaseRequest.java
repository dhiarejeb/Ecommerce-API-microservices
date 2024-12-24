package com.dhia.product.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductPurchaseRequest(
        @NotNull(message = "product is is mandatory")
        Integer productId,
        @Positive
        double quantity
) {
}
