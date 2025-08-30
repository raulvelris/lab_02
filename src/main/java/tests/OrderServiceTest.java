/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import com.solid.corrected.OrderService;
import com.solid.corrected.mock.MockLogger;
import com.solid.corrected.mock.MockNotificationService;
import com.solid.corrected.mock.MockRepository;

/**
 *
 * @author jacks
 */
public class OrderServiceTest {
    public static void main(String[] args) {
        // Arrange (mocks)
        MockNotificationService n = new MockNotificationService();
        MockLogger l = new MockLogger();
        MockRepository r = new MockRepository();

        OrderService svc = new OrderService(n, l, r);

        // Act  (¡sin argumentos con nombre!)
        svc.processOrder("C1", new String[]{"P1", "P2"}, "EMAIL");

        // Assert (activa -ea para que funcionen)
        assert r.saved : "No se guardó el pedido en el repositorio";
        assert n.sent  : "No se envió la notificación";
        assert l.lastMessage != null : "No se generó log";

        System.out.println("✓ Test con mocks OK (sin BD/archivos/emails reales)");
    }
}