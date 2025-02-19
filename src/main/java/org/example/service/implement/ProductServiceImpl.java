package org.example.service.implement;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findTop10SoldProducts() {
        return productRepository.findTop10ByOrderBySoldQuantityDesc();
    }
    @Override
    public List<Product> findRecentProducts() {
        LocalDateTime sevenDaysAgo = LocalDateTime.now().minusDays(7);
        return productRepository.findTop10ByCreateDateAfterOrderByCreateDateDesc(sevenDaysAgo);
    }

}
