package com.demo.service;

import com.demo.domain.Order;

public class OrderService {

    private static OrderService instance;
    private EmailService emailService;

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    public OrderService() {
        emailService = EmailService.getInstance();
    }

    void placeOrder(Order order) {
        double priceWithTax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(priceWithTax);
        emailService.sendEmail(order);
        order.setCustomerNotified(true);
    }

    boolean placeOrder(Order order, String cc) {
        double priceWithTax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(priceWithTax);
        boolean isNotified = emailService.sendEmail(order, cc);
        order.setCustomerNotified(isNotified);
        return isNotified;
    }
}
