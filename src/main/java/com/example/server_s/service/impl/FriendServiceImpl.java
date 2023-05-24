package com.example.server_s.service.impl;

import com.example.server_s.domain.Friend;
import com.example.server_s.domain.User;
import com.example.server_s.repository.FriendRepository;
import com.example.server_s.repository.UserRepository;
import com.example.server_s.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService{
    private final FriendRepository repository;

    @Autowired
    public FriendServiceImpl(FriendRepository repository) {
        this.repository = repository;
    }

    @Override
    public Friend add(Friend friend) {
        return repository.save(friend);
    }

    @Override
    public List<Friend> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public Friend findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Friend update(Friend friend) {
        return repository.save(friend);
    }
}
