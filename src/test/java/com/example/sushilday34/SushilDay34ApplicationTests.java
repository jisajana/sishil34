package com.example.sushilday34;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootTest
class SushilDay34ApplicationTests {
    String username = "";
    String password = "admin";
    String email = "admin@email.com";

    User user1 = new User(username, password);
    User user2 = new User(username, password, email);

    @Autowired
    UserService userService;

    /*@Test
    public String signup() {
       return userService.signup(user2);
    }

    @Test
    public String login() {
        return userService.login(user1);
    } */

@Test
    public String signup(User user) {
        if (user.getUsername() == null ||
                user.getUsername().equals("") ||
                user.getPassword() == null ||
                user.getPassword() .equals("") ||
                user.getEmail() == null ||
                user.getEmail().equals ("")) {
            return "username or password or email is blank";
        }
        return "Signup successful";
    }

    @Test
    public String login(User user) {
        if (user.getUsername() != null && user.getPassword() != null) {
            if (user.getUsername() == "admin" && user.getPassword() == "admin") {
                return "Login Successful";
            }
        }
        return "Login failed";
    }


}
