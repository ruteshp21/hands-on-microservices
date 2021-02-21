package com.rutesh.microservices.api.core.product;

public class Product {

    private final int productId;
    private final String name;
    private final int weight;

    public Product() {
        this.productId = 0;
        this.name = "";
        this.weight = 0;
    }

    public Product(int productId, String name, int weight) {
        this.productId = productId;
        this.name = name;
        this.weight = weight;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
