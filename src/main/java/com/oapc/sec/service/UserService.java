package com.oapc.sec.service;

import java.util.List;

import com.oapc.sec.model.User;

public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
