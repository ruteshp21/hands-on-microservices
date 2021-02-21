package com.rutesh.microservices.review.web;

import com.rutesh.microservices.api.core.review.IReviewService;
import com.rutesh.microservices.api.core.review.Review;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReviewService implements IReviewService {

    @Override
    public List<Review> getReviews(int productId) {
        Review review = new Review(productId,1,"Peterson","12 Rules", "12 Rules content");
        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review);
        return reviewList;
    }

}
