package com.haha.moduleweb.controller;

import com.haha.service.ProductService;
import com.haha.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Hello {
    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @GetMapping("/hello")
    public String helloController(){
        log.info("hello controller executed");
        return userService.HelloEvery();
    }


    @GetMapping("/buy")
    public String buyController(){
        log.error("buyController Error");
        log.debug("buyController debug");
        log.trace("buyController trace");
        log.info("buyController info");
        return productService.buyProduct();
    }
}
