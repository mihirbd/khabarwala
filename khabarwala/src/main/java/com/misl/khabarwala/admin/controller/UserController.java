package com.misl.khabarwala.admin.controller;

import com.misl.khabarwala.admin.domain.User;
import com.misl.khabarwala.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("{id}")
    public Optional<User> getUser(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveEntity(user);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable("id") Long id){
        userService.updateEntity(user, id);
        return status(HttpStatus.OK).body(null);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUser(Long id){
        userService.deleteEntity(id);
        return status(HttpStatus.ACCEPTED).body(null);
    }

}
