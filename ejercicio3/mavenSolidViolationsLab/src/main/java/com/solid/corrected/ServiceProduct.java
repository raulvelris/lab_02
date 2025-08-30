/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Dell
 */
public class ServiceProduct extends Product implements Serviceable{
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
    public void scheduleService(){
        System.out.println("Servicio "+ name + "programado (" + duration + "h)");
    }
    
    @Override
    public int getServiceDuration(){
        return duration;
    }
}
