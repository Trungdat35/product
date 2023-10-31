package com.example.product.service;

import com.example.product.DTO.CustomProduct;
import com.example.product.exception.AllException;
import com.example.product.models.PDPD;
import com.example.product.models.ProductDetail;
import com.example.product.repository.PDDRepo;
import com.example.product.repository.PDPDRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PDDService implements IPDDService {
    @Autowired
    private PDDRepo pddRepo;
    @Autowired
    private PDPDRepo pdpdRepo;

    @Override
    public void createProductDetail(ProductDetail pdd) {
        pddRepo.save(pdd);
    }

    @Override
    public List<ProductDetail> getListProductDetail() {
        return pddRepo.findAll();
    }

    @Override
    public void updatePDD(ProductDetail pdd) {
       Optional<ProductDetail> pddOption = pddRepo.findById(pdd.getProductDetailID());
       if(pddOption.isPresent()){
           ProductDetail pddCurrent = pddOption.get();
           int quantityUpdate = pdd.getQuantity();
           int quantityCurrent = pddCurrent.getQuantity();
           if(quantityUpdate != quantityCurrent){
               int quantity = quantityCurrent - quantityUpdate;
               do {
                   pddCurrent.setQuantity(pddCurrent.getQuantity() - quantity);
                   pddRepo.save(pddCurrent);
                   pddCurrent = pddCurrent.getProductDetail();
               } while (pddCurrent != null);
           }
       }else {
           throw new AllException("Không tìm thấy sản phẩm !");
       }
    }

    @Override
    public void updateQuantity(CustomProduct customProduct) {
        String pddID = pdpdRepo.findPDD(customProduct.getListPP(), customProduct.getListPP().size());
        if(pddID == null){
            throw new AllException("Không tìm thấy sản phẩm !");
        }
        int quantityNew = customProduct.getQuantity();
        Optional<ProductDetail> pddOption = pddRepo.findById(Integer.parseInt(pddID));
        if (pddOption.isPresent()) {
            ProductDetail pddCurrent = pddOption.get();
            int quantityCurrent = pddCurrent.getQuantity();
            if (quantityCurrent <= 0) throw new AllException("Sản phẩm đã hết !");
            int quantityUpdate = quantityCurrent - quantityNew;
            if (quantityUpdate >= 0) {
                do {
                    pddCurrent.setQuantity(pddCurrent.getQuantity() - customProduct.getQuantity());
                    pddRepo.save(pddCurrent);
                    pddCurrent = pddCurrent.getProductDetail();
                } while (pddCurrent != null);
            } else {
                throw new AllException("Số lượng không đủ !");
            }
        } else {
            throw new AllException("Sản phẩm không tồn tại !");
        }
    }

    @Override
    public ProductDetail getPPDbyID(int ppdID) {
        return pddRepo.findProductDetailByProductDetailID(ppdID);
    }
}
