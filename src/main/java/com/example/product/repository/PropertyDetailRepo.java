package com.example.product.repository;

import com.example.product.models.PropertyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyDetailRepo extends JpaRepository<PropertyDetails, Integer> {
    @Query(value = "select * from property_details where property_id = :ppID", nativeQuery = true)
    List<PropertyDetails> getPropertyDetailsByPropertyID(int ppID);
}
