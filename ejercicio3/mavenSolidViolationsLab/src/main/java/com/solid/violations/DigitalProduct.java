/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.violations;

/**
 *
 * @author Dell
 */
public class DigitalProduct extends Product{
    public DigitalProduct(String name, double basePrice){
        super(name, basePrice);
    }
    @Override
    public double calculatePrice(){
        return basePrice;
    }
    @Override
    public double calculateShippingCost(){
        throw new UnsupportedOperationException("Digital no requiere envio");
    }
    @Override
    public boolean requiresPhysicalDelivery(){
        return false;
    }
    
}

