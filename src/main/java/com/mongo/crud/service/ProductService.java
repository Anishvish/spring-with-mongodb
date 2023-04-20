package com.mongo.crud.service;

import com.mongo.crud.model.Product;
import com.mongo.crud.model.Response;

import java.util.List;

public interface ProductService {
    Response addProduct(Product product);

    List<Product> getAllProducts();
}
