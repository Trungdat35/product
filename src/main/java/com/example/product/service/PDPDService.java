package com.example.product.service;

import com.example.product.models.PDPD;
import com.example.product.repository.PDPDRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PDPDService implements IPDPDService{
    @Autowired
    private PDPDRepo pdpdRepo;
    @Override
    public void createPDPD(PDPD pdpd) {
        pdpdRepo.save(pdpd);
    }

    @Override
    public List<PDPD> getListPDPD() {
        return  pdpdRepo.findAll();
    }
}
