package com.training.basic.animal;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Auh Auh Auh\n");
    }

    public Dog(){
        super.setName("Bob Tadinho");
        super.setAge(5);
        super.setBreed("Pastor Alemão");
    }
}
