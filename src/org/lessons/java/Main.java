package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Dog dogRex = new Dog("Rex");
        Sparrow sparrowApollo = new Sparrow("Apollo");
        Dolphin dolphinFlipper = new Dolphin("Flipper");
        Eagle eagleAchille =new Eagle("Achille");

        Animal[] animals = {dogRex, sparrowApollo, dolphinFlipper, eagleAchille };

        for (Animal animal : animals) {
            System.out.println("************************************************");

            System.out.println(animal.getName());
            animal.eat();
            animal.sleep();
            animal.call();

            System.out.println("************************************************");
            System.out.println("\n");
        }
    }
}
