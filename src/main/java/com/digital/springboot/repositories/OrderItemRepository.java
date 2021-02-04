package com.digital.springboot.repositories;

import com.digital.springboot.model.OrderItem;
import com.digital.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
