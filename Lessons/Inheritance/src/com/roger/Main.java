package com.roger;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 20, 20, "long sliky");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
