package com.magicdu.dubbo.dept.controller;

import com.magicdu.dubbo.back.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Reference
    private UserService userService;

    @RequestMapping("/sayHi/{name}")
    public String sayHello(@PathVariable String name){
        return userService.sayHello(name);
    }
}
