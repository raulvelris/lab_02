/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Dell
 */
public class OrderProcessor {
    public double total(Product p){
        return p.calculatePrice();
    }
    public double total(Product p, Shippable s){
        return p.calculatePrice() + s.calculateShippingCost();
    }
}
