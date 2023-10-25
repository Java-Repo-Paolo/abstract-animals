package org.lessons.java.animal;

public class Main {
    public static void main(String[] args) {
        Dog dogRex = new Dog("Rex");
        Sparrow sparrowApollo = new Sparrow("Apollo");
        Dolphin dolphinFlipper = new Dolphin("Flipper");
        Eagle eagleAchille =new Eagle("Achille");

        Animal[] animals = {dogRex, sparrowApollo, dolphinFlipper, eagleAchille};

        for (Animal animal : animals) {
            System.out.println("************************************************");

            System.out.println(animal.getName());
            animal.eat();
            animal.sleep();
            animal.call();
            if (animal instanceof CanSwim){
                //((CanSwim) animal).swim();
                letItSwim((CanSwim) animal);
            }else if (animal instanceof CanFly){
                //((CanFly) animal).fly();
                letItFly((CanFly) animal);
            }

            System.out.println("************************************************");
            System.out.println("\n");
        }
        //letItFly(eagleAchille);
        //letItSwim(dolphinFlipper);
    }

    private static void letItFly(CanFly animal){
        animal.fly();
    }
    private static void letItSwim(CanSwim animal){
        animal.swim();
    }
}
