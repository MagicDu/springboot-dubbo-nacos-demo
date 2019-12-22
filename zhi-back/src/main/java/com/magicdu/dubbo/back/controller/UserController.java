package com.magicdu.dubbo.back.controller;

import com.magicdu.dubbo.dept.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private DeptService deptService;
    @RequestMapping("/userinfo/{name}")
    public String getUserInfo(@PathVariable String name){
        return deptService.getDeptId(name);
    }
}
