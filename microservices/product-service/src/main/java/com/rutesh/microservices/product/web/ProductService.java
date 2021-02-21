package com.rutesh.microservices.product.web;

import com.rutesh.microservices.api.core.product.IProductService;
import com.rutesh.microservices.api.core.product.Product;

public class ProductService implements IProductService {

    @Override
    public Product getProduct(int productId) {
        return new Product(productId,"product-" + productId, 2);
    }

}
