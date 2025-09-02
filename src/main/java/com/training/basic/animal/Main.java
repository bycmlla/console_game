package com.training.basic.animal;

public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("O nome do Cachorro é: "+ dog.getName());
        System.out.println("O idade do Cachorro é: "+ dog.getAge());
        System.out.println("O raça do Cachorro é: "+ dog.getBreed());
        dog.makeSound();

        System.out.println("O gatinho se chama: " + cat.getName());
        System.out.println("A idade do gatinho é: " + cat.getAge());
        System.out.println("A raça do gatinho é: " + cat.getBreed());
        cat.makeSound();
    }
}
