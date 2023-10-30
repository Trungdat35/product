package com.example.product.service;

import com.example.product.models.Properties;
import com.example.product.repository.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropertyService implements IPropretyService{
    @Autowired
    private PropertyRepo propertyRepo;
    @Override
    public void createProperty(Properties pp) {
        propertyRepo.save(pp);
    }

    @Override
    public List<Properties> getListProperty() {
        return propertyRepo.findAll();
    }
}
