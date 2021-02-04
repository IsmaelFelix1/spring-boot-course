package com.digital.springboot.repositories;

import com.digital.springboot.model.Order;
import com.digital.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
