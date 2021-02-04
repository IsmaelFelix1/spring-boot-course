package com.digital.springboot.services;

import com.digital.springboot.model.Order;
import com.digital.springboot.model.User;
import com.digital.springboot.repositories.OrderRepository;
import com.digital.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return  obj.get();
    }
}
