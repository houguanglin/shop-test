package com.haha.user.service;

import com.haha.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表信息 服务类
 * </p>
 *
 * @author hgl
 * @since 2022-12-21
 */
public interface UserService extends IService<User> {

    public String HelloEvery();
}
