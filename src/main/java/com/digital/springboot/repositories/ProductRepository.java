package com.digital.springboot.repositories;

import com.digital.springboot.model.Category;
import com.digital.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
