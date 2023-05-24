package com.example.server_s.service;

import com.example.server_s.domain.Friend;
import com.example.server_s.repository.FriendRepository;

import java.util.List;

public interface FriendService {
    Friend add(Friend friend);
    List<Friend> getAll();
    void deleteById(long id);
    Friend findById(long id);
    Friend update(Friend friend);
}
