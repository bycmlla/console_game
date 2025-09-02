package com.training.basic.animal;

public class Animal {
    private String name;
    private int age;
    private String breed;

    public void makeSound() {
        System.out.println("Generic sound...");
    }

    public void favoriteFood(){
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
