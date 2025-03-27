package com.clothing.repository;

import com.clothing.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Eksempel på ekstra metode:
    List<Product> findByCategory(String category);
}
