package com.andersen.controller;

import com.andersen.service.UserService;
import com.andersen.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userService.findAllUsers();
    }
    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable long id){
        userService.deleteById(id);
    }
    @GetMapping("/user/{id}")
    public User getById(@PathVariable long id){
        return userService.getById(id);
    }

    @PostMapping("/user")
    public void update( @RequestBody User user){
        userService.put(user);
    }
    @PutMapping("/user")
    public void create( @RequestBody User user){
        userService.create(user);
    }




}
