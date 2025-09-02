package com.training.basic.animal;

public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Meawh Meawh Meawh");
    }

    public Cat(){
        super.setName("Nenezi");
        super.setAge(1);
        super.setBreed("De rua");
    }
}
