package com.solid.corrected.mock;

import com.solid.corrected.interfaz.OrderRepository;

public class MockRepository implements OrderRepository {
    public boolean saved = false;
    @Override

    public void saveOrder(String orderData) {
        saved = true;
        System.out.println("[MOCK REPO] Orden simulada: " + orderData);
    }

    @Override
    public String getCustomerData(String customerId) {
        System.out.println("[MOCK REPO] Consultando cliente simulado: " + customerId);
        return "MockCliente(" + customerId + ")";
    }
}