package com.example.demo.service;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class DemoServiceTest {

    @Autowired
    @InjectMocks
    private DemoService testService;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("TestServiceTest -> @BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("TestServiceTest -> @AfterAll");
    }

    @AfterEach
    void tearDown() {
        System.out.println("TestServiceTest -> @AfterEach");
    }

    @BeforeEach
    void setUp() {
        System.out.println("TestServiceTest -> @BeforeEach");
    }

    @Test
    void method1() {
        testService.method1();
    }

    @Test
    void method2() {
        testService.method2();
    }
}