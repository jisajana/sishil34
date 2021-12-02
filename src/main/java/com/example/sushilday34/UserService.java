package com.example.sushilday34;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /*String signup(String username, String password, String email);

    String login(String username, String password);*/

    String signup(User user);

    String login(User user);
}
