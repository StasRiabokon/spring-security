package com.nau.spring.security.service;

import com.nau.spring.security.model.User;

public interface UserService {
    User findByUserEmail(String email);

    void saveUser(User user);
}
