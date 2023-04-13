package com.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.demo.domain.Order;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {
    @Mock
    public EmailService emailService ;
    @Mock
    public Order order = new Order(27,"Gaming Laptop",100000D) ;

    @InjectMocks
    OrderService orderService ;

    @Test()
    public void testPlaceOrder(){
        orderService.placeOrder(order);
        verify(emailService ).sendEmail(order);
    }

    @Test
    public void testPlaceOrderWithString(){
        String message = "Order is placed" ;
        when(emailService.sendEmail(order , message)).thenReturn(true) ;
        assertTrue(orderService.placeOrder(order , message)); ;
    }
}
