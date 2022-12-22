package com.haha.service.impl;

import com.haha.service.ProductService;
import com.haha.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    UserService userService;


    @Override
    public String buyProduct() {
        return userService.HelloEvery() + " 请务必购买";
    }
}
