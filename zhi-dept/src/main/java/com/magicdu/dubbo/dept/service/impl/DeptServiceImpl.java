package com.magicdu.dubbo.dept.service.impl;


import com.magicdu.dubbo.dept.service.DeptService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Override
    public String getDeptId(String userName) {
        return "get dept id "+userName;
    }
}
