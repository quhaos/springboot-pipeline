package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public DemoService() {
    }

    public void method1(){
            System.out.println("TestService -> method1");
        }

        public void method2(){
            System.out.println("TestService -> method2");
        }
    }

