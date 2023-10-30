package com.example.product.service;

import com.example.product.models.PDPD;
import com.example.product.models.ProductDetail;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPDPDService {
    public void createPDPD(PDPD pdpd);
    public List<PDPD> getListPDPD();

}
