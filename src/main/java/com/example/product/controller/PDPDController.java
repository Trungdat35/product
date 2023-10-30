package com.example.product.controller;

import com.example.product.exception.Response;
import com.example.product.models.PDPD;
import com.example.product.models.PropertyDetails;
import com.example.product.service.IPDPDService;
import com.example.product.service.IPPDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PDPDController {
    @Autowired
    private IPDPDService ipdpdService;
    @PostMapping(value = "/creatpdpd",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> createPDPD(@RequestBody PDPD pdpd){
        ipdpdService.createPDPD(pdpd);
        return ResponseEntity.ok(new Response(HttpStatus.ACCEPTED,"Create pdpd successful !"));
    }
    @GetMapping(value = "/getlistpdpd")
    public List<PDPD> getListPDPD(){
        return ipdpdService.getListPDPD();
    }
}
