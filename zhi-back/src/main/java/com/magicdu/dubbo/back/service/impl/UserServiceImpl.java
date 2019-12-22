package com.magicdu.dubbo.back.service.impl;

import com.magicdu.dubbo.back.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String userName) {
        log.info("请求接口---->");
        return "hello"+userName;
    }
}
