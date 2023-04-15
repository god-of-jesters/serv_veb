package com.example.server_s.service;

import com.example.server_s.domain.User;

import java.util.List;

public interface UserService {
    User add(User user);

    List<User> getAll();

    User getById(long id);

    User update(User user);

    void deleteById(long id);
}
