package com.example.product.service;

import com.example.product.models.Products;

import java.util.List;

public interface IProductService {
    public void createProduct(Products pd);
    public List<Products> getListProduct();
}
