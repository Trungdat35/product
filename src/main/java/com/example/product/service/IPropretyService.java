package com.example.product.service;

import com.example.product.models.Products;
import com.example.product.models.Properties;

import java.util.List;

public interface IPropretyService {
    public void createProperty(Properties pp);
    public List<Properties> getListProperty();
}
