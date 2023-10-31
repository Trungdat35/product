package com.example.product.service;

import com.example.product.models.PropertyDetails;
import com.example.product.repository.PropertyDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyDetailService implements IPPDService{
    @Autowired
    private PropertyDetailRepo propertyDetailRepo;
    @Override
    public void createPropertyDetail(PropertyDetails ppd) {
        propertyDetailRepo.save(ppd);
    }

    @Override
    public List<PropertyDetails> getListPropertyDetail() {
        return propertyDetailRepo.findAll();
    }

    @Override
    public List<PropertyDetails> getListPropertyDatailByProperty(int ppID) {
        return propertyDetailRepo.getPropertyDetailsByPropertyID(ppID);
    }
}
