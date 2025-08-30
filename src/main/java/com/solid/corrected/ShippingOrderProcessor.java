package com.solid.corrected;

import java.util.Date;

public class ShippingOrderProcessor implements OrderManager, ShippingService {

    @Override
    public void createOrder(String customerId, String[] productIds) {
        System.out.println("Orden creada con envío para cliente: " + customerId);
    }

    @Override
    public void cancelOrder(String orderId) {
        System.out.println("Orden cancelada: " + orderId);
    }

    @Override
    public void updateOrderStatus(String orderId, String status) {
        System.out.println("Estado actualizado: " + status);
    }

    @Override
    public void calculateShippingCost(String orderId) {
        System.out.println("Costo de envío calculado para orden: " + orderId);
    }

    @Override
    public void scheduleDelivery(String orderId, Date date) {
        System.out.println("Entrega programada para " + date);
    }

    @Override
    public void trackShipment(String orderId) {
        System.out.println("Seguimiento de envío para orden: " + orderId);
    }
}
