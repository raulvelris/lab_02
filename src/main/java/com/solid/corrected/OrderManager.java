package com.solid.corrected;

public interface OrderManager {
    void createOrder(String customerId, String[] productIds);
    void cancelOrder(String orderId);
    void updateOrderStatus(String orderId, String status);
}
