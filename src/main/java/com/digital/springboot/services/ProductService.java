package com.digital.springboot.services;

import com.digital.springboot.model.Product;
import com.digital.springboot.model.User;
import com.digital.springboot.repositories.ProductRepository;
import com.digital.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return  obj.get();
    }
}
