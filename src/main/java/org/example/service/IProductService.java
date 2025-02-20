package org.example.service;

import org.example.entity.Category;
import org.example.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IProductService {
    List<Product> findTop10SoldProducts();
    List<Product> findRecentProducts();
    Set<Product> findByCategory(Category category);

}
