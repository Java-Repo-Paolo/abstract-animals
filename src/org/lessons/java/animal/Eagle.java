package org.lessons.java.animal;

public class Eagle extends Animal implements CanFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I am an animal that eats meat");
    }

    @Override
    public void call() {
        System.out.println("strid strid");
    }


    @Override
    public void fly() {
        System.out.println("i'm an eagle! I'm flying!");
    }
}
