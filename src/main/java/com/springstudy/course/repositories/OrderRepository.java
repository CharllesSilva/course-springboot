package com.springstudy.course.repositories;

import com.springstudy.course.entities.Order;
import com.springstudy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
