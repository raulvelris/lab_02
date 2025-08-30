package com.solid.corrected;

public interface ReportGenerator {
    String generateOrderReport(String orderId);
    String generateDailyReport(String date);
    String generateCustomerReport(String customerId);
}
