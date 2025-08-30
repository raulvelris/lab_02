package com.solid.corrected;

import com.solid.corrected.interfaz.Logger;
import com.solid.corrected.interfaz.NotificationService;
import com.solid.corrected.interfaz.OrderRepository;

import com.solid.corrected.concreta.EmailNotificationService;
import com.solid.corrected.concreta.FileLoggerService;
import com.solid.corrected.concreta.DatabaseOrderRepository;

import com.solid.corrected.mock.MockLogger;
import com.solid.corrected.mock.MockNotificationService;
import com.solid.corrected.mock.MockRepository;

public class DependencyInjector {

    public static OrderService createOrderService() {
        NotificationService notificationService = new EmailNotificationService();
        Logger logger = new FileLoggerService();
        OrderRepository orderRepository = new DatabaseOrderRepository();
        return new OrderService(notificationService, logger, orderRepository);
    }

    public static OrderService createTestOrderService() {
        NotificationService notificationService = new MockNotificationService();
        Logger logger = new MockLogger();
        OrderRepository orderRepository = new MockRepository();
        return new OrderService(notificationService, logger, orderRepository);
    }
}