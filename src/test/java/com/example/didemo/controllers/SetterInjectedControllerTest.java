package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import com.example.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.HELLO,setterInjectedController.sayHello());
    }
}
