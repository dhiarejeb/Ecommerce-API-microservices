package com.dhia.ecommerce.customer;


import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Validated
public class Adress {
    private String street;
    private String housenumber;
    private String zipcode;
}
