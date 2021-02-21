package com.rutesh.microservices.api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IReviewService {

    @GetMapping(value = "/review", produces = "application/json")
    List<Review> getReviews(@RequestParam(name = "productId", required = true) int productId);

}
