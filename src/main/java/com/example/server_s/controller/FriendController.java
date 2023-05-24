package com.example.server_s.controller;

import com.example.server_s.domain.Friend;
import com.example.server_s.domain.User;
import com.example.server_s.repository.FriendRepository;
import com.example.server_s.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {
    private final FriendService service;

    @Autowired
    public FriendController(FriendService service){
        this.service = service;
    }

    @PostMapping("/friend")
    public Friend add(@RequestBody Friend friend){
        return service.add(friend);
    }

    @GetMapping("/friend")
    public List<Friend> getAll() {
        return service.getAll();
    }

    @GetMapping("/friend/{id}")
    public Friend getById(@PathVariable long id) {
        return service.findById(id);
    }

    @PutMapping("/friend")
    public Friend update(@RequestBody Friend friend){
        return service.update(friend);
    }

    @DeleteMapping("/friend/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
