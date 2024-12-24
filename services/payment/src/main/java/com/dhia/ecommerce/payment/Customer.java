package com.dhia.ecommerce.payment;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public record Customer(
        String id,
        @NotNull(message = "verify firstName")
        String firstName,
        @NotNull(message = "verify lastName")
        String lastName,

        @Email(message = "verify email")
        String email
) {
}
