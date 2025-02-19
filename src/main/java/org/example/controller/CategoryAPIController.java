package org.example.controller;

import org.example.entity.Category;
import org.example.entity.Product;
import org.example.model.Response;
import org.example.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path = "/api/category")
public class CategoryAPIController {
    @Autowired
    private ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<?> getAllCategory() {
        //return ResponseEntity.ok().body(categoryService.findAll());
        return new ResponseEntity<Response>(new Response(true, "Thành công",
                categoryService.findAll()), HttpStatus.OK);
    }
    @GetMapping(path = "/getCategory")
    public ResponseEntity<?> getCategory(@Validated @RequestParam("id") Long id) {
        Optional<Category> category = categoryService.findById(id);

        if (category.isPresent()) {
            //return ResponseEntity.ok().body(category.get());
            return new ResponseEntity<Response>(new Response(true, "Success", category.get()), HttpStatus.OK);
        } else {
            //return ResponseEntity.notFound().build();
            return new ResponseEntity<Response>(new Response(false, "Failed", null), HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping(path = "/getAllProduct")
    public ResponseEntity<Response> getAllProductByCategory(@RequestParam("id") Long id)
    {
        Optional<Category> category = categoryService.findById(id);
        System.out.println(category);
        if (category.isPresent())
        {
            Set<Product> products = category.get().getProducts();
            System.out.println(products);
            if (!products.isEmpty())
            {
                return new ResponseEntity<Response>(new Response(true, "Success", products), HttpStatus.OK);
            }

        }
        return new ResponseEntity<Response>(new Response(false, "Failed",null), HttpStatus.OK);
    }
}
