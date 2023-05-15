package com.example.server_s.service;

import com.example.server_s.domain.Friend;

import java.util.List;

public interface FriendsService {
    Friend add(Friend friend);

    List<Friend> getAll();

    Friend getById(long id);


    Friend update(Friend friend);

    void deleteById(long id);
}
