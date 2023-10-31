package com.example.product.repository;

import com.example.product.models.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PDDRepo extends JpaRepository<ProductDetail,Integer> {
    ProductDetail findProductDetailByProductDetailID(int pddID);
    @Query(value = "select * from product_detail where product_detail_id in:list",nativeQuery = true)
    List<ProductDetail> getListPD(List<Integer> list);
}
