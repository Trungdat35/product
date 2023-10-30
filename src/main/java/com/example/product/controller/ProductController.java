package com.example.product.controller;

import com.example.product.exception.Response;
import com.example.product.models.Products;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @PostMapping(value = "/creatproduct",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> createProduct(@RequestBody Products pd){
        iProductService.createProduct(pd);
        return ResponseEntity.ok(new Response(HttpStatus.ACCEPTED,"Create product successful !"));
    }
    @GetMapping(value = "/getlistproduct")
    public List<Products> getListProduct(){
        return iProductService.getListProduct();
    }
}
