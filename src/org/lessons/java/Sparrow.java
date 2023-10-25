package org.lessons.java;

public class Sparrow extends Animal {
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


}
