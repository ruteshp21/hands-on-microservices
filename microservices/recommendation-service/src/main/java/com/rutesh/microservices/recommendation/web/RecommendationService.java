package com.rutesh.microservices.recommendation.web;

import com.rutesh.microservices.api.core.recommendation.IRecommendationService;
import com.rutesh.microservices.api.core.recommendation.Recommendation;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecommendationService implements IRecommendationService {

    @Override
    public List<Recommendation> getRecommendations(int productId) {
        Recommendation recommendation = new Recommendation(1,productId,"Jordan",5,"Abc product content");
        List<Recommendation> recommendationList = new ArrayList<>();
        recommendationList.add(recommendation);
        return recommendationList;
    }

}
