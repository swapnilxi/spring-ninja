package com.swapnilxi.springsecuritycouponstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapnilxi.springsecuritycouponstore.Entity.User;
import com.swapnilxi.springsecuritycouponstore.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User User) {
        return userRepository.save(User);
    }

    public User getDetails(String username) {
        return userRepository.findByUname(username);
    }

    public String getStudentRoles(String username) {
        return userRepository.findByUname(username).getUrole();
    }
}

