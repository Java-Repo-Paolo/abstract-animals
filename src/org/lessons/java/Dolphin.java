package org.lessons.java;

public class Dolphin extends Animal {
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


}
