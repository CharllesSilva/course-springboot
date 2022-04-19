package com.springstudy.course.repositories;

import com.springstudy.course.entities.Category;
import com.springstudy.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
