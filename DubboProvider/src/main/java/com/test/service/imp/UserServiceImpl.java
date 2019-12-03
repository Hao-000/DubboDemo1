package com.test.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "hello world";
    }
}
