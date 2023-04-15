package com.example.server_s.controller;

import com.example.server_s.domain.User;
import com.example.server_s.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/user")
    public User add(@RequestBody User user){
        return service.add(user);
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user){
        return service.update(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
