/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Dell
 */
public class DigitalProduct extends Product implements Downloadable {
    private String downloadUrl;
    private long fileSize;
    
    public DigitalProduct(String name, double basePrice, String downloadUrl, long fileSize){
        super(name, basePrice);
        this.downloadUrl = downloadUrl;
        this.fileSize = fileSize;
    }
    
    @Override
    public double calculatePrice(){
        return basePrice;
    }
    
    @Override
    public String getDownloadUrl(){
        return downloadUrl;
    }
    
    @Override
    public long getFileSize(){
        return fileSize;
    }
    
}
