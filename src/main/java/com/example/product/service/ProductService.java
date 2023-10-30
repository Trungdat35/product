package com.example.product.service;

import com.example.product.models.Products;
import com.example.product.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductRepo productRepo;
    @Override
    public void createProduct(Products pd) {
        productRepo.save(pd);
    }
    @Override
    public List<Products> getListProduct() {
       return productRepo.findAll();
    }
}
