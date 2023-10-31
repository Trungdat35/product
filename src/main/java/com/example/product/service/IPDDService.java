package com.example.product.service;

import com.example.product.DTO.CustomProduct;
import com.example.product.models.ProductDetail;
import com.example.product.models.Products;

import java.util.List;

public interface IPDDService {
    public void createProductDetail(ProductDetail pdd);
    public List<ProductDetail> getListProductDetail();
    public void updatePDD(ProductDetail pdd);
    public void updateQuantity(CustomProduct customProduct);
    public ProductDetail getPPDbyID(int ppdID);
}
