package org.lessons.java.animal;

public class Sparrow extends Animal implements CanFly {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I am an animal that eat nuts and fruits");
    }

    @Override
    public void call() {
        System.out.println("Cip Cip");
    }


    @Override
    public void fly() {
        System.out.println("i'm an sparrow! I'm flying!");
    }
}
