package com.example.server_s.service;

import com.example.server_s.domain.Friends;

import java.util.List;

public interface FriendsService {
    Friends add(Friends friend);

    List<Friends> getAll();

    Friends getById(long id);


    Friends update(Friends friend);

    void deleteById(long id);
}
