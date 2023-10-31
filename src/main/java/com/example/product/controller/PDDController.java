package com.example.product.controller;

import com.example.product.DTO.CustomProduct;
import com.example.product.exception.Response;
import com.example.product.models.ProductDetail;
import com.example.product.models.PropertyDetails;
import com.example.product.service.IPDDService;
import com.example.product.service.IPPDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PDDController {
    @Autowired
    private IPDDService ipddService;
    @PostMapping(value = "/creatpdd",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> createPDD(@RequestBody ProductDetail pdd){
        ipddService.createProductDetail(pdd);
        return ResponseEntity.ok(new Response(HttpStatus.ACCEPTED,"Create pdd successful !"));
    }
    @GetMapping(value = "/getlistpdd")
    public List<ProductDetail> getListPPD(){
        return ipddService.getListProductDetail();
    }
    @PutMapping(value = "/updateQuantity",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> updateQuantity(@RequestBody CustomProduct pdd){
        ipddService.updateQuantity(pdd);
        return ResponseEntity.ok(new Response(HttpStatus.ACCEPTED,"Update quantity pdd successful !"));
    }
    @PutMapping(value = "/updatePDD",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> updatePDD(@RequestBody ProductDetail pdd){
        ipddService.updatePDD(pdd);
        return ResponseEntity.ok(new Response(HttpStatus.ACCEPTED,"Update pdd successful !"));
    }
    @GetMapping(value = "/getpddbyid/{id}")
    public ProductDetail getPPDByID(@PathVariable(name = "id" )int ppdID){
        return ipddService.getPPDbyID(ppdID);
    }
    @GetMapping(value = "/getpd")
    public List<ProductDetail>  getPPDByID(){
        return ipddService.getListProduct();
    }
}
