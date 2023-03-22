package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {

    @Test
    public void testgetInstance(){
        OrderService orderService = OrderService.getInstance();
        assertTrue(orderService instanceof OrderService);
    }
    @Test
    public void testBooleanPlaceOrder(){
        Order order = new Order(10,"Cherry",400);
        assertTrue(OrderService.getInstance().placeOrder(order,"Cherry"));
    }
}
