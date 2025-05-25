package com.tejas.model;
/**
 * Car class extending Vehicle.
 * Demonstrates Inheritance and Polymorphism.
 */
public class Car extends Vehicle {

    public Car(String brand, String color, int wheels) {
        super(brand, color, wheels);
    }

    @Override
    public void showDetails() {
        System.out.println("🚗 Car -> Brand: " + getBrand() + ", Color: " + getColor() + ", Wheels: " + getWheels());
    }
}
