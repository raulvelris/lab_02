
package com.solid.corrected;

public class UserReportGenerator {
           
    private final DiscountCalculator calculator = new DiscountCalculator();
         
    public String generateUserReport(User user) {
        double discount = calculator.calculateDiscount(user);
        
        return "=== REPORTE DE USUARIO ===\n"
                + "Nombre: " + user.getName() + "\n"
                + "Email: " + user.getEmail() + "\n"
                + "Tipo: " + user.getUserType() + "\n"
                + "Total Compras: $" + user.getTotalPurchases() + "\n"
                + "Descuento Aplicable: " + (discount * 100) + "%\n";
    }
}
