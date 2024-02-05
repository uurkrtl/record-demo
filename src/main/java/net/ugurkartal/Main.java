package net.ugurkartal;

public class Main {
    public static void main(String[] args) {
        Owner ugur = new Owner("Ugur Kartal", 36, "BW");
        Owner ingo = new Owner("Ingo Becker", 30, "NRW");
        Owner siqi = new Owner("Siqi Chen", 36, "Hessen");

        Species meat = new Species("Meat", 200);
        Species grain = new Species("Grain", 250);
        Species foodChicken = new Species("Chicken", 100);

        Animal dog1 = new Animal(1001L, "Dog", "Australian Shepherd", 3, ugur, meat);
        Animal cat = new Animal(1002L, "Cat", "Shorthair", 5, siqi, foodChicken);
        Animal chicken = new Animal(1003L, "Chicken", "Shorthair", 2, ingo, grain);
        Animal horse = new Animal(1004L, "Horse", "Black Forest", 1, ugur, grain);
        Animal dog2 = new Animal(1005L, "Dog", "Bulldog", 7, ingo, meat);
        Animal dog3 = new Animal(1001L, "Dog", "Australian Shepherd", 3, ugur, meat);


        System.out.println("equals (dog1 vs. dog3: " + dog1.equals(dog3));
        System.out.println("equals (cat vs. horse: " + cat.equals(horse));
        System.out.println("toString (chicken): " + chicken);
    }
}