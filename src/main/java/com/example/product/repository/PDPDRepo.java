package com.example.product.repository;

import com.example.product.models.PDPD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PDPDRepo extends JpaRepository<PDPD,Integer> {
    @Query(value = "select product_detail_id from pdpd where property_detail_id in:list group by product_detail_id having count(*) = :count", nativeQuery = true)
    public String findPDD(List<Integer> list, int count);
}
