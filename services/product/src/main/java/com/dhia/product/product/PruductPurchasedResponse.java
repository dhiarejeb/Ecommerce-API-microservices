package com.dhia.product.product;

import java.math.BigDecimal;

public record PruductPurchasedResponse(
        Integer productId,
        String name,
        String description,
        BigDecimal price,
        double quantity

) {
}
