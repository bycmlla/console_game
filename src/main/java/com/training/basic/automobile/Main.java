package com.training.basic.automobile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Hyundai", 2022, 12);
        c1.carDetails();

        Motorcycle m1 = new Motorcycle("Honda", 2025, 17);
        m1.carDetails();

        List<Car> carros = new ArrayList<>();
        carros.add(new Car("Hyundai", 2022, 12));
        carros.add(new Car("Volkswagem", 2024, 14));
        carros.add(new Car("BYD", 2025, 23));
        carros.add(new Car("Cadachery", 2025, 22));

        List<Motorcycle> motos = new ArrayList<>();
        motos.add(new Motorcycle("Yamaha", 2026, 15));
        motos.add(new Motorcycle("Honda", 2025, 18));
        motos.add(new Motorcycle("Newvia Bajaj", 2025, 17));

        for (Motorcycle m : motos) {
            System.out.println("A moto da marca " + m.getBrand() + " faz " + m.getKml() + "km por Litro. Seu ano é " + m.getYear() + "\n");
        }


        for (Car c : carros) {
            System.out.println("O carro da marca " + c.getBrand() + " faz " + c.getKml() + "km por litro. O seu ano é " + c.getYear() + "\n");
        }

    }
}
