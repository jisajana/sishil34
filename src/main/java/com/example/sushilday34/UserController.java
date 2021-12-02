package com.example.sushilday34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin

public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup") // http://localhost:8080/signup
    public String signup(@RequestBody User user){
        try{
            return userService.signup(user);
        }
        catch(Exception e) {
            return  "something went wrong ";
        }


    }
    @PostMapping("/login") //http://localhost:8080/login
    public String login(@RequestBody User user) {
        try {
            return userService.login(user);
        } catch (Exception e) {
            return "something went wrong ";
        }
    }

    /*@RequestMapping("/signup")
    public String signup(@RequestBody String username, String password, String email){
        try{
            return userService.signup(username, password, email);
        }
        catch(Exception e) {
            return  "something went wrong ";
        }


    }
    @RequestMapping("/login")
    public String login(@RequestBody String username, String password) {
        try {
            return userService.login(username, password);
        } catch (Exception e) {
            return "something went wrong ";
        }
    }
*/

    @GetMapping("/test")
    public String Test(){
        return "This is test.";
    }
}

