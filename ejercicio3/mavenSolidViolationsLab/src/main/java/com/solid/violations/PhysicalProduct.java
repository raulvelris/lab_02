/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.violations;

/**
 *
 * @author Dell
 */
public class PhysicalProduct extends Product {
    private final double weight;

    public PhysicalProduct(String name, double basePrice, double weight){
        super(name, basePrice);
        this.weight = weight;
    }

    @Override 
    public double calculatePrice(){ 
        return basePrice; 
    }
    
    @Override 
    public double calculateShippingCost(){ 
        return weight * 2.0; 
    }
    
    @Override 
    public boolean requiresPhysicalDelivery(){ 
        return true; 
    }
}
