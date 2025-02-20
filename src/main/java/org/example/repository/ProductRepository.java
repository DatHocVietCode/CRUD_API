package org.example.repository;

import org.example.entity.Category;
import org.example.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;
import java.util.Set;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductNameContaining(String name);
    Page<Product> findByProductNameContaining(String name, Pageable pageable);
    Optional<Product> findByProductName(String name);
    Optional<Product> findByCreateDate(Date createAt);
    List<Product> findTop10ByOrderBySoldQuantityDesc();
    List<Product> findTop10ByCreateDateAfterOrderByCreateDateDesc(LocalDateTime date);
    Set<Product> findByCategory(Category category);
}
