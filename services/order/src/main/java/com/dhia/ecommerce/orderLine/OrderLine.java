package com.dhia.ecommerce.orderLine;

import com.dhia.ecommerce.order.Order;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class OrderLine {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    //@OneToMany
    //@JoinColumn(name = "product_id")
    private Integer productId ;

    private double quantity;



}
