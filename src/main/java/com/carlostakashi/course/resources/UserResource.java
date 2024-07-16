package com.carlostakashi.course.resources;

import org.springframework.web.bind.annotation.RestController;

import com.carlostakashi.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

    @GetMapping    
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "maria", "maria@gmail.com", "999999", "senha123");
        return ResponseEntity.ok().body(u);
    }

}
