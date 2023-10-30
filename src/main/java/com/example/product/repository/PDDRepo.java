package com.example.product.repository;

import com.example.product.models.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PDDRepo extends JpaRepository<ProductDetail,Integer> {
}
