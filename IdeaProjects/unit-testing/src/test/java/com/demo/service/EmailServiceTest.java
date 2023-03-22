package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Test
    public void testBooleansendEmail(){
        Order order = new Order(10,"Apple",500);
        assertTrue(EmailService.getInstance().sendEmail(order,"Apple"));

    }


    @Test(expected = RuntimeException.class)
    public void testVoidsendEmail(){
        Order order = new Order(20,"Banana",400);
        EmailService.getInstance().sendEmail(order);

    }

    @Test
    public void testgetInstance(){
        EmailService emailService = EmailService.getInstance();
        assertTrue(emailService instanceof EmailService);
    }
}