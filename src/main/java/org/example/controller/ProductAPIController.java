package org.example.controller;

import org.example.entity.Product;
import org.example.model.Response;
import org.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/product")
public class ProductAPIController {
    @Autowired
    IProductService productService;
    @GetMapping("/top10-sold")
    public ResponseEntity<Response> getTop10SoldProducts() {
        List<Product> products = productService.findTop10SoldProducts();
        return new ResponseEntity<>(new Response(true, "Success", products), HttpStatus.OK);
    }
    @GetMapping("/recent")
    public ResponseEntity<Response> getRecentProducts() {
        List<Product> products = productService.findRecentProducts();
        return new ResponseEntity<>(new Response(true, "Success", products), HttpStatus.OK);
    }

}
