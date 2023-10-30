package com.example.product.repository;

import com.example.product.models.PropertyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyDetailRepo extends JpaRepository<PropertyDetails, Integer> {
}
