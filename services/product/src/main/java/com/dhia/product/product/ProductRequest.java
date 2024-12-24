package com.dhia.product.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest(

        Integer id,
        @NotNull
        String name,
        String description,
        @Positive
        double availableQuantity,
        @Positive
        BigDecimal price,
        @NotNull
        Integer category_id
) {
}
