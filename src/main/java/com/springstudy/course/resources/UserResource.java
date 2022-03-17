package com.springstudy.course.resources;

import com.springstudy.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> FindAll(){
        User u = new User(1L, "Maria", "999999", "Maria@gmail.com", "123");
        return ResponseEntity.ok().body(u);
    }
}
