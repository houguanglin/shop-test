package com.haha.user.service.impl;

import com.haha.user.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHi() {
        return "Hi";
    }
}
