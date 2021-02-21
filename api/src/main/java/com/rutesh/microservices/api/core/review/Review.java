package com.rutesh.microservices.api.core.review;

public class Review {

    private final int productId;
    private final int reviewId;
    private final String author;
    private final String subject;
    private final String content;

    public Review() {
        this.productId = 0;
        this.reviewId = 0;
        this.author = "";
        this.subject = "";
        this.content = "";
    }

    public Review(int productId, int reviewId, String author, String subject, String content) {
        this.productId = productId;
        this.reviewId = reviewId;
        this.author = author;
        this.subject = subject;
        this.content = content;
    }

    public int getProductId() {
        return productId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
