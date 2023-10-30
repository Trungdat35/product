package com.example.product.controller;

import com.example.product.exception.Response;
import com.example.product.models.Products;
import com.example.product.models.Properties;
import com.example.product.service.IProductService;
import com.example.product.service.IPropretyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PropertyController {
    @Autowired
    private IPropretyService iPropretyService;
    @PostMapping(value = "/creatproperty",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> createProduct(@RequestBody Properties pp){
        iPropretyService.createProperty(pp);
        return ResponseEntity.ok(new Response(HttpStatus.ACCEPTED,"Create property successful !"));
    }
    @GetMapping(value = "/getlistproperty")
    public List<Properties> getListProperty(){
        return iPropretyService.getListProperty();
    }
}
