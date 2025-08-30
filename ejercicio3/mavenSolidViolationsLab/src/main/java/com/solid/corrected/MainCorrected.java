/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Dell
 */
public class MainCorrected {
    public static void main(String[] args){
        OrderProcessor checkout = new OrderProcessor();
        
        PhysicalProduct book = new PhysicalProduct("Libro",30,1.0, new StandardShipping());
        DigitalProduct ebook = new DigitalProduct("Ebook",15,"http://downloads/ebook",2048);
        ServiceProduct cleaning = new ServiceProduct("Limpieza",100,3);
        
        
        System.out.println("Total físico: "+ checkout.total(book,book));
        System.out.println("Total digital: "+ checkout.total(ebook));
        System.out.println("Total servicio: "+ checkout.total(cleaning));
    }
}
