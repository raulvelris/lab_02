/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.violations;

/**
 *
 * @author Dell
 */
public class MainViolation {
    public static void main(String[] args){
        Product book = new PhysicalProduct("Libro",30,1.0);
        Product ebook = new DigitalProduct("Ebook",15);
        Product cleaning = new ServiceProduct("Limpieza",100,3);
        
        book.processOrder();
        
        try{
            ebook.processOrder();
        }catch(UnsupportedOperationException ex){
            System.out.println("Error LSP con DigitalProduct: "+ ex.getMessage());
        }
        
        cleaning.processOrder();
    }
}
