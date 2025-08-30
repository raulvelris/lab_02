package com.solid.corrected;

public class CompleteOrderProcessor {

    private final OrderManager orderManager;
    private final PaymentHandler paymentHandler;
    private final ShippingService shippingService;
    private final InventoryManager inventoryManager;
    private final NotificationSender notificationSender;
    private final ReportGenerator reportGenerator;

    public CompleteOrderProcessor(
            OrderManager orderManager,
            PaymentHandler paymentHandler,
            ShippingService shippingService,
            InventoryManager inventoryManager,
            NotificationSender notificationSender,
            ReportGenerator reportGenerator) {
        this.orderManager = orderManager;
        this.paymentHandler = paymentHandler;
        this.shippingService = shippingService;
        this.inventoryManager = inventoryManager;
        this.notificationSender = notificationSender;
        this.reportGenerator = reportGenerator;
    }

    public void processCompleteOrder(String customerId, String[] productIds) {
        orderManager.createOrder(customerId, productIds);
        paymentHandler.processPayment("ORD123", "CARD", "DATA");
        inventoryManager.reserveProduct(productIds[0], 1);
        notificationSender.sendOrderConfirmation("ORD123");
        shippingService.calculateShippingCost("ORD123");
        System.out.println(reportGenerator.generateOrderReport("ORD123"));
    }
}
