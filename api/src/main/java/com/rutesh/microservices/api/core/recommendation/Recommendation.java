package com.rutesh.microservices.api.core.recommendation;

import lombok.*;

@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Recommendation {

    int productId;
    int recommendationId;
    String author;
    int rate;
    String content;

}
