package com.example.demo.service;

import com.example.demo.controller.DemoController;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(MockitoJUnitRunner.class)
class DemoServiceTest {
    @Test
    public void test(){
        DemoService mock = Mockito.mock(DemoService.class);
        DemoController demoController=new DemoController(mock);
        Mockito.when(mock.print(Mockito.anyString())).thenReturn("allen");
        Assert.assertEquals("Helloallen",demoController.hello("111"));
    }

}