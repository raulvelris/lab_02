package com.solid.corrected;

public interface InventoryManager {
    boolean checkProductAvailability(String productId, int qty);
    void reserveProduct(String productId, int qty);
    void releaseProductReservation(String productId, int qty);
}
