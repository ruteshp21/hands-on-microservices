package com.rutesh.microservices.api.core.recommendation;

import java.util.List;

public interface IRecommendationService {

    List<Recommendation> getRecommendations(int productId);

}
