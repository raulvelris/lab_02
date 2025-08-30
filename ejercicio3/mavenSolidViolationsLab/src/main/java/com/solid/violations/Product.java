/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.solid.violations;

/**
 *
 * @author Dell
 */

public abstract class Product {
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();
    public abstract double calculateShippingCost(); // <-- rompe LSP
    public abstract boolean requiresPhysicalDelivery();

    public void processOrder(){
        double total = calculatePrice() + calculateShippingCost();
        System.out.println("Procesando " + name + " - Total: " + total);
    }
}
