package org.lessons.java;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I am an animal that eats meat and fish");
    }

    @Override
    public void call() {
        System.out.println("Bau Bau");
    }
}
