package com.solid.corrected;

public interface NotificationSender {
    void sendOrderConfirmation(String orderId);
    void sendShippingNotification(String orderId);
    void sendDeliveryNotification(String orderId);
}
