package com.haha.user.service.impl;

import com.haha.user.entity.User;
import com.haha.user.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haha.user.service.TestService;
import com.haha.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表信息 服务实现类
 * </p>
 *
 * @author hgl
 * @since 2022-12-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    TestService testService;

    @Override
    public String HelloEvery() {
        return "Hello "+ getById(1).getUsername() + " "+testService.sayHi();
    }
}
