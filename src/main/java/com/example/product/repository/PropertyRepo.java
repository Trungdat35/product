package com.example.product.repository;

import com.example.product.models.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepo extends JpaRepository<Properties,Integer> {
    @Query(value = "SELECT * FROM properties  WHERE product_id = :pdID", nativeQuery = true)
    List<Properties> getPropertiesByProductID(int pdID);
}
