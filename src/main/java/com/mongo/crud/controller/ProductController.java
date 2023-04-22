package com.mongo.crud.controller;

import com.mongo.crud.annotation.AddProduct;
import com.mongo.crud.annotation.ProductAll;
import com.mongo.crud.model.Product;
import com.mongo.crud.model.Response;
import com.mongo.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @AddProduct
    @PostMapping("addProduct")
    public Response addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @ProductAll
    @GetMapping("getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
