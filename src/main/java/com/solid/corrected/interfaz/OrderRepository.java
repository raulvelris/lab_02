package com.solid.corrected.interfaz;

public interface OrderRepository {
    void saveOrder(String orderData);
    String getCustomerData(String customerId);
}