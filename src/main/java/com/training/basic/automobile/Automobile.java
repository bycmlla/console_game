package com.training.basic.automobile;

public abstract class Automobile {
    private String type;
    private String brand;
    private int year;
    private int kml;

    public void carDetails(){
        System.out.println("O(a) " + type + " " + brand + " faz " + kml + "km por litro!");
    }

    public String getType(){
        return type;
    }

    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    public int getKml(){
        return kml;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setKml(int kml){
        this.kml = kml;
    }
}
