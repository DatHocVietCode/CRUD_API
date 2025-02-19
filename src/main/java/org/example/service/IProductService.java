package org.example.service;

import org.example.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findTop10SoldProducts();
    List<Product> findRecentProducts();

}
