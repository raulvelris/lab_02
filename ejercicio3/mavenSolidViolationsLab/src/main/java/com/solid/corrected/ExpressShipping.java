/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Dell
 */
public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculate(double weight){
        return weight * 5.0;
    }
    
}
