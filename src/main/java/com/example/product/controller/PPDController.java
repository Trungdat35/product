package com.example.product.controller;

import com.example.product.exception.Response;
import com.example.product.models.Products;
import com.example.product.models.PropertyDetails;
import com.example.product.service.IPPDService;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PPDController {
    @Autowired
    private IPPDService ippdService;
    @PostMapping(value = "/creatppd",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> createPPD(@RequestBody PropertyDetails ppd){
        ippdService.createPropertyDetail(ppd);
        return ResponseEntity.ok(new Response(HttpStatus.ACCEPTED,"Create ppd successful !"));
    }
    @GetMapping(value = "/getlistppd")
    public List<PropertyDetails> getListPPD(){
        return ippdService.getListPropertyDetail();
    }
}
