/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

/**
 *
 * @author jacks
 */
public class SolidViolationsDemo {
       public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE VIOLACIONES SOLID ===\n");
        
        // TODO: Ejecutar ejemplos de cada violación
        // TODO: Mostrar problemas que causan
        // TODO: Ejecutar versiones corregidas
        // TODO: Comparar diferencias
        
        demonstrateSRPViolation();
        demonstrateOCPViolation();
        demonstrateLSPViolation();
        demonstrateISPViolation();
        demonstrateDIPViolation();
    }
    
    private static void demonstrateSRPViolation() {
        System.out.println("--- SRP Violation ---");
        // TODO: Implementar demostración
    }
    
    private static void demonstrateOCPViolation() {
        System.out.println("--- OCP Violation ---");
        // TODO: Implementar demostración
    }
    
    private static void demonstrateLSPViolation() {
        System.out.println("--- LSP Violation ---");
        // TODO: Implementar demostración
    }
    
    private static void demonstrateISPViolation() {
        System.out.println("--- ISP Violation ---");
        // TODO: Implementar demostración
    }
    
    public static void demonstrateDIPViolation() {
    System.out.println("=== DIP: Antes (violación) ===");
    // SIN import de 'violations'
    violations.OrderService oldSvc = new violations.OrderService();
    oldSvc.processOrder("C0", new String[]{"P0"}, "EMAIL"); // ⚠️ puede tener efectos

    System.out.println("\n=== DIP: Después (corregido) ===");
    com.solid.corrected.OrderService newSvc =
            com.solid.corrected.DependencyInjector.createOrderService();
    newSvc.processOrder("C1", new String[]{"P1","P2"}, "EMAIL");

    System.out.println("\n=== DIP: Test con mocks ===");
    com.solid.corrected.OrderService testSvc = new com.solid.corrected.OrderService(
            new com.solid.corrected.mock.MockNotificationService(),
            new com.solid.corrected.mock.MockLogger(),
            new com.solid.corrected.mock.MockRepository()
    );
    testSvc.processOrder("C2", new String[]{"P3"}, "EMAIL");
}
}
