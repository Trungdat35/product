package com.example.product.service;

import com.example.product.models.Properties;
import com.example.product.models.PropertyDetails;

import java.util.List;

public interface IPPDService {
    public void createPropertyDetail(PropertyDetails ppd);
    public List<PropertyDetails> getListPropertyDetail();
    public  List<PropertyDetails> getListPropertyDatailByProperty(int ppID);
}
