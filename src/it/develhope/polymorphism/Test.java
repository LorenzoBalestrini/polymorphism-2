package it.develhope.polymorphism;

public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal("Default animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");

        animal.animalSound();
        System.out.println("----------");
        lion.animalSound();
        System.out.println("----------");
        cow.animalSound();
    }
}
