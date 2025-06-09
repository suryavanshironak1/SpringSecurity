package com.telusko.spring_sec_demo.controller;

import com.telusko.spring_sec_demo.model.User;
import com.telusko.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PutMapping("register")
    public User register(@RequestBody User user){
        System.out.println("register called");
        return service.saveUser(user);
    }
}
