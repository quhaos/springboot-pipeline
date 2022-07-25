package com.example.demo.service;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(MockitoJUnitRunner.class)
class DemoServiceTest {


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

}