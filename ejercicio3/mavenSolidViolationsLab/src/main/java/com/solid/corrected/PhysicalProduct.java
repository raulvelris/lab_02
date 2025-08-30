/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Dell
 */
public class PhysicalProduct extends Product implements Shippable {
    private double weight;
    private ShippingStrategy strategy;
    
    public PhysicalProduct(String name, double basePrice, double weight, ShippingStrategy strategy){
        super(name,basePrice);
        this.weight = weight;
        this.strategy = strategy;
    }
    
    @Override
    public double calculatePrice(){
        return basePrice;
    }
    
    @Override
    public double calculateShippingCost(){
        return strategy.calculate(weight);
    }
    @Override
    public boolean requiresPhysicalDelivery(){
        return true;
    }
}
