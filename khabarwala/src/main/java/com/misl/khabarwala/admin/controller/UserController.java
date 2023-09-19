package com.misl.khabarwala.admin.controller;

import com.misl.khabarwala.admin.domain.User;
import com.misl.khabarwala.admin.service.UserService;
import com.misl.khabarwala.admin.serviceImpl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveEntity(user);
    }


}
