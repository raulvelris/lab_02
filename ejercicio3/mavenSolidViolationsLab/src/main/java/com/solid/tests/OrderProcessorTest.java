/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.tests;
import com.solid.corrected.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dell
 */

public class OrderProcessorTest {

    @Test
    public void testPhysicalProductTotal() {
        PhysicalProduct book = new PhysicalProduct("Libro", 30, 2.0, new StandardShipping());
        OrderProcessor checkout = new OrderProcessor();
        assertEquals(34.0, checkout.total(book, book), 0.01);
    }

    @Test
    public void testDigitalProductTotal() {
        DigitalProduct ebook = new DigitalProduct("Ebook", 15, "http://url", 1000);
        OrderProcessor checkout = new OrderProcessor();
        assertEquals(15.0, checkout.total(ebook), 0.01);
    }

    @Test
    public void testServiceProductTotal() {
        ServiceProduct cleaning = new ServiceProduct("Limpieza", 100, 3);
        OrderProcessor checkout = new OrderProcessor();
        assertEquals(100.0, checkout.total(cleaning), 0.01);
    }
}
