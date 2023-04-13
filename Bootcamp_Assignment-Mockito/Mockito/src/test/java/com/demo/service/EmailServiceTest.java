package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Mock
    Order order = new Order(15,"OnePlus" , 35000) ;

    @InjectMocks
    EmailService emailService ;

    @Test(expected = RuntimeException.class)
    public void testSendEmail(){
        emailService.sendEmail(order);
    }
    @Test
    public void testSendEmailWithString(){
        String message = "Order is dispatched" ;
        assertTrue(emailService.sendEmail(order , message)) ;
    }
}