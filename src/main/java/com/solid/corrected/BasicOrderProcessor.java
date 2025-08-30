package com.solid.corrected;

public class BasicOrderProcessor implements OrderManager {

    @Override
    public void createOrder(String customerId, String[] productIds) {
        System.out.println("Orden creada para cliente: " + customerId);
    }

    @Override
    public void cancelOrder(String orderId) {
        System.out.println("Orden cancelada: " + orderId);
    }

    @Override
    public void updateOrderStatus(String orderId, String status) {
        System.out.println("Estado de la orden " + orderId + " actualizado a " + status);
    }
}
