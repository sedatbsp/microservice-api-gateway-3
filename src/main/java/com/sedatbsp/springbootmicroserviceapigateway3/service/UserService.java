package com.sedatbsp.springbootmicroserviceapigateway3.service;

import com.sedatbsp.springbootmicroserviceapigateway3.model.Role;
import com.sedatbsp.springbootmicroserviceapigateway3.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
