package com.example.server_s.service;

import com.example.server_s.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User add(User user);

    List<User> getAll();

    User update(User user);

    void deleteById(long id);

    User getById(long id);
}
