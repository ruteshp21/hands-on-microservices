package com.rutesh.microservices.api.core.product;

import lombok.*;

@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Product {

    int productId;
    String name;
    int weight;

}
