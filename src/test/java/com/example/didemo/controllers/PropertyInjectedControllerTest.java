package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.HELLO,propertyInjectedController.sayHello());
    }
}
