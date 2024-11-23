package com.example.demo.serivce;

import org.springframework.stereotype.Service;

@Service
public class BasicServiceImpl implements BasicService {
    @Override
    public String hello() {
        return "hello world";
    }
}
