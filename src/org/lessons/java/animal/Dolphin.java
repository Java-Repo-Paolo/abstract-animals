package org.lessons.java.animal;

public class Dolphin extends Animal implements CanSwim {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I am an animal that eat fish, shellfish, squid");
    }

    @Override
    public void call() {
        System.out.println("Fri Fri");
    }


    @Override
    public void swim() {
        System.out.println("I'm a dolphin! I'm swimming!");
    }
}
