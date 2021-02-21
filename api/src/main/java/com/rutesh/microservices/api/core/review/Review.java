package com.rutesh.microservices.api.core.review;

import lombok.*;

@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Review {

    int productId;
    int reviewId;
    String author;
    String subject;
    String content;

}
