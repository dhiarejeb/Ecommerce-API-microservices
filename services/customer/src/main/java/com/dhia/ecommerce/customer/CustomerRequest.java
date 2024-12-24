package com.dhia.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull
        String firstName,
        @NotNull
        String lastName,
        @NotNull
        @Email(message = "customer email is not valid")
        String email,
        Adress adress
) {
}
