package com.rutesh.microservices.api.core.recommendation;

public class Recommendation {

    private final int productId;
    private final int recommendationId;
    private final String author;
    private final int rate;
    private final String content;

    public Recommendation() {
        this.productId = 0;
        this.recommendationId = 0;
        this.author = "";
        this.rate = 0;
        this.content = "";
    }

    public Recommendation(int productId, int recommendationId, String author, int rate, String content) {
        this.productId = productId;
        this.recommendationId = recommendationId;
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
