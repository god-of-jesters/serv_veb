package com.example.server_s.controller;

import com.example.server_s.domain.Friend;
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
    public Friend add(@RequestBody Friend friend) {return service.add(friend);}

    @GetMapping("/friends")
    public List<Friend> getAll(){
        return service.getAll();
    }

    @GetMapping("/friends/{id}")
    public Friend getById(@PathVariable long id){return service.getById(id);}

    @PutMapping("/friends")
    public Friend update(Friend friend){
        return service.update(friend);
    }

    @DeleteMapping("/friends/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
