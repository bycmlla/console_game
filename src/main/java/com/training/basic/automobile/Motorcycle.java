package com.training.basic.automobile;

public class Motorcycle extends Automobile{

    public Motorcycle(String brand, int year, int kml){
        super.setType("Moto");
        super.setBrand(brand);
        super.setYear(year);
        super.setKml(kml);
    }
}
