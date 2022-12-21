package com.haha.moduleweb.controller;

import com.haha.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    // todo 这里注入对象会失败
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String helloController(){
        return userService.HelloEvery();
    }
}
