package com.solid.corrected;

public interface PaymentHandler {
    boolean processPayment(String orderId, String method, String data);
    void processRefund(String orderId, double amount);
}
