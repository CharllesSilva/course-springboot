package com.springstudy.course.repositories;

import com.springstudy.course.entities.Category;
import com.springstudy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
