package com.example.server_s.controller;

import com.example.server_s.domain.Friends;
import com.example.server_s.domain.Place;
import com.example.server_s.service.impl.FriendsServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendsController {
    private final FriendsServiceimpl service;

    @Autowired
    public FriendsController(FriendsServiceimpl service) {
        this.service = service;
    }

    @PostMapping("/friends")
    public Friends add(@RequestBody Friends friends) {return service.add(friends);}

    @GetMapping("/friends")
    public List<Friends> getAll(){
        return service.getAll();
    }

    @GetMapping("/friends/{id}")
    public Friends getById(@PathVariable long id){return service.getById(id);}

    @PutMapping("/friends")
    public Friends update(Friends friends){
        return service.update(friends);
    }

    @DeleteMapping("/friends/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
