package com.training.basic.automobile;

public class Car extends Automobile{
    public Car(String brand, int year, int kml) {
        super.setType("Carro");
        super.setBrand(brand);
        super.setYear(year);
        super.setKml(kml);
    }
}
