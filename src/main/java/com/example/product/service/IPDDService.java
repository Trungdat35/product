package com.example.product.service;

import com.example.product.DTO.CustomPPD;
import com.example.product.DTO.CustomProduct;
import com.example.product.models.ProductDetail;
import com.example.product.models.Products;

import java.util.List;

public interface IPDDService {
    public void createProductDetail(ProductDetail pdd);
    public List<ProductDetail> getListProductDetail();
    public void updatePDD(ProductDetail pdd);
    public void updateQuantity(CustomProduct customProduct);
    public ProductDetail getPDDbyID(int ppdID);
    public List<ProductDetail> getListProduct();
    public ProductDetail getPDDbyPPD(List<Integer> integerList);
}
