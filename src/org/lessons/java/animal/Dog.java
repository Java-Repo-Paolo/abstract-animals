package org.lessons.java.animal;

public class Dog extends Animal implements CanSwim{
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

    @Override
    public void swim() {
        System.out.println("i'm a dog! I can swim!");
    }
}
