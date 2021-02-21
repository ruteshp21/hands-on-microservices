package com.rutesh.microservices.api.core.review;

import java.util.List;

public interface IReviewService {

    List<Review> getReviews(int productId);

}
