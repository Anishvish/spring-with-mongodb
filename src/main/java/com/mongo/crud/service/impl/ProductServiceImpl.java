package com.mongo.crud.service.impl;

import com.mongo.crud.model.Product;
import com.mongo.crud.model.Response;
import com.mongo.crud.repository.MongoRepo;
import com.mongo.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private MongoRepo mongoRepo;

    @Override
    public Response addProduct(Product product) {
        mongoRepo.save(product);
        return Response.builder().message("Product added successfully").build();
    }

    @Override
    public List<Product> getAllProducts() {
        return mongoRepo.findAll();
    }
}
