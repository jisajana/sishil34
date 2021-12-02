package com.example.sushilday34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String signup(User user) {
        String message = "username or password or email is blank";
        if (user.getUsername() != null &&
                !user.getUsername().equals("") &&
                user.getPassword() != null &&
                !user.getPassword() .equals("") &&
                user.getEmail() != null &&
                !user.getEmail().equals ("")) {
            message="Signup successful";
        }
        return message;
    }

    @Override
    public String login(User user) {
       String  message = "Login failed";
        System.out.println(user.getUsername()+ " , " + user.getPassword() );
        if (user.getUsername() != null && user.getPassword() != null) {
            if (user.getUsername().equalsIgnoreCase("admin")  && user.getPassword().equalsIgnoreCase("admin")) {
                message =  "Login Successful";
            }
        }
        return message;
    }




    /*@Override
    public String signup(String username, String password, String email) {

        if (username == null ||
                username.equals("") ||
                password == null ||
                password.equals("") ||
                email == null ||
                email.equals ("")) {
            return "username or password or email is blank";
        }

        return "Signup successful";
    }

    @Override
    public String login(String username, String password) {

        if (username != null || password != null) {
            if (username == "admin" && password == "admin") {
                return "Login Successful";
            }
        }
            return "Login failed";
        }
*/

}
