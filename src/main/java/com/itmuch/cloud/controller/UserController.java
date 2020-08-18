package com.itmuch.cloud.controller;

import com.itmuch.cloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.itmuch.cloud.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
     UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne = userRepository.findOne(id);
        return findOne;
    }
}
