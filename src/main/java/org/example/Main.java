package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Erdbewohner betritt den Raum");
        sayHello(true);
        System.out.println("Er steigt aus aus seinem");
        String vehicle1 = chooseVehicle(true);
        System.out.println(vehicle1);

        System.out.println("Marsbewohner betritt den Raum");
        sayHello(false);
        String vehicle2 = chooseVehicle(false);
        System.out.println("Er steigt aus aus seinem");
        System.out.println(vehicle2);
    }

    public static void sayHello(boolean livingOnEarth) {
        System.out.println("Hello");
        if (livingOnEarth) {
            System.out.println("World");
        } else {
            System.out.println("Mars");
        }
        System.out.println("!");
    }

    public static String chooseVehicle(boolean livingOnEarth) {
        if (livingOnEarth) {
            return "Auto";
        } else {
            return "UFO";
        }
    }

}