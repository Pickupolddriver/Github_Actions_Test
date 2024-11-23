package com.example.demo.service;

import com.example.demo.serivce.BasicServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class BasicServiceTest {

    private static BasicServiceImpl basicService;

    @BeforeAll
    public static void init() {
        basicService = new BasicServiceImpl();
    }

    @Test
    public void testHello() {
        Assertions.assertEquals("hello world", basicService.hello());
    }

}
