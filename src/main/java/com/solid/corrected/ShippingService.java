package com.solid.corrected;

import java.util.Date;

public interface ShippingService {
    void calculateShippingCost(String orderId);
    void scheduleDelivery(String orderId, Date date);
    void trackShipment(String orderId);
}
