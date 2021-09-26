package com.example.demo1.controller;

import com.example.demo1.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/home")
    public User helloword(){
    User user =new User(1,"Nguyễn Quang Tùng");
    return user;


}
}
