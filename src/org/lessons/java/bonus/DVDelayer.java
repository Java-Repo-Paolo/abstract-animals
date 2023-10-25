package org.lessons.java.bonus;

public class DVDelayer implements Device {

    @Override
    public void play() {
        System.out.println("Hello! I'm a DVDelayer and I'm in play mode");
    }

    @Override
    public void stop() {
        System.out.println("I'm a DVDelayer and I'm in stop mode");
    }
}
