package com.rutesh.microservices.api.core.recommendation;

public class Recommendation {

    private final int recommendationId;
    private final int productId;
    private final String author;
    private final int rate;
    private final String content;

    public Recommendation() {
        this.recommendationId = 0;
        this.productId = 0;
        this.author = "";
        this.rate = 0;
        this.content = "";
    }

    public Recommendation(int recommendationId, int productId, String author, int rate, String content) {
        this.recommendationId = recommendationId;
        this.productId = productId;
        this.author = author;
        this.rate = rate;
        this.content = content;
    }

    public int getRecommendationId() {
        return recommendationId;
    }

    public int getProductId() {
        return productId;
    }

    public String getAuthor() {
        return author;
    }

    public int getRate() {
        return rate;
    }

    public String getContent() {
        return content;
    }

}
