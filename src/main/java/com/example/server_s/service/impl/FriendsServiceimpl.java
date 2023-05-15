package com.example.server_s.service.impl;

import com.example.server_s.domain.Friend;
import com.example.server_s.repository.FriendsRepository;
import com.example.server_s.service.FriendsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendsServiceimpl implements FriendsService {
    private final FriendsRepository repository;

    public FriendsServiceimpl(FriendsRepository repository) {
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
    public Friend getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Friend update(Friend friend) {
        return repository.save(friend);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
