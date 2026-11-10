
package com.example;

class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {

    void displayType() {
        System.out.println("Vehicle Type: Car");
    }
}

class Bike extends Vehicle {

    void displayType() {
        System.out.println("Vehicle Type: Bike");
    }
}

public class VehicleInheritance {

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println("Car Details");
        c.start();
        c.displayType();
        c.stop();

        System.out.println("----------------");

        Bike b = new Bike();

        System.out.println("Bike Details");
        b.start();
        b.displayType();
        b.stop();
    }
}
