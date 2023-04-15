package com.example.server_s.service.impl;

import com.example.server_s.domain.Friends;
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
    public Friends add(Friends friend) {
        return repository.save(friend);
    }

    @Override
    public List<Friends> getAll() {
        return repository.findAll();
    }

    @Override
    public Friends getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Friends update(Friends friend) {
        return repository.save(friend);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
