package com.example.product.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomProduct {
    private int pdID;
    private List<Integer> listPP;
    private  int quantity;
}
