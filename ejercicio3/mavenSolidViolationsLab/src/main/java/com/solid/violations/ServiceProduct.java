/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.violations;

/**
 *
 * @author Dell
 */


public class ServiceProduct extends Product {
    private int duration;
    public ServiceProduct(String name, double basePrice, int duration){
        super(name, basePrice);
        this.duration = duration;
    }
    @Override 
    public double calculatePrice(){ 
        return basePrice; 
    }
    
    @Override 
    public double calculateShippingCost(){ 
        return 0; 
    }
    
    @Override 
    public boolean requiresPhysicalDelivery(){ 
        return false; 
    }
}

