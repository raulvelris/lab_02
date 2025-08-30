package com.solid.corrected;

public class Main {
    public static void main(String[] args) {
        OrderManager basicOrderProcessor = new BasicOrderProcessor();
        basicOrderProcessor.createOrder("CUST001", new String[]{"PROD1", "PROD2"});

        ShippingOrderProcessor shippingOrder = new ShippingOrderProcessor();
        shippingOrder.calculateShippingCost("ORD123");

        // Ejemplo de composición
        CompleteOrderProcessor completeOrderProcessor = new CompleteOrderProcessor(
                new BasicOrderProcessor(),
                new PaymentHandler() {
                    public boolean processPayment(String orderId, String method, String data) {
                        System.out.println("Pago procesado para " + orderId);
                        return true;
                    }
                    public void processRefund(String orderId, double amount) {
                        System.out.println("Reembolso de " + amount + " procesado para " + orderId);
                    }
                },
                shippingOrder,
                new InventoryManager() {
                    public boolean checkProductAvailability(String productId, int qty) {
                        return true;
                    }
                    public void reserveProduct(String productId, int qty) {
                        System.out.println("Producto reservado: " + productId);
                    }
                    public void releaseProductReservation(String productId, int qty) {
                        System.out.println("Reserva liberada: " + productId);
                    }
                },
                new NotificationSender() {
                    public void sendOrderConfirmation(String orderId) {
                        System.out.println("Confirmacion enviada para orden: " + orderId);
                    }
                    public void sendShippingNotification(String orderId) {}
                    public void sendDeliveryNotification(String orderId) {}
                },
                new ReportGenerator() {
                    public String generateOrderReport(String orderId) {
                        return "Reporte de la orden: " + orderId;
                    }
                    public String generateDailyReport(String date) { return "Reporte diario: " + date; }
                    public String generateCustomerReport(String customerId) { return "Reporte cliente: " + customerId; }
                }
        );

        completeOrderProcessor.processCompleteOrder("CUST001", new String[]{"PROD1"});
    }
}
