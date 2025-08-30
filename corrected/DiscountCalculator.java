
package com.solid.corrected;

public class DiscountCalculator {
    public double calculateDiscount(User user) {
        switch (user.getUserType()) {
            case "PREMIUM":
                return user.getTotalPurchases() > 1000 ? 0.20 : 0.15;
            case "VIP":
                return user.getTotalPurchases() > 2000 ? 0.30 : 0.25;
            default:
                return user.getTotalPurchases() > 500 ? 0.10 : 0.05;
        }
    }
}
