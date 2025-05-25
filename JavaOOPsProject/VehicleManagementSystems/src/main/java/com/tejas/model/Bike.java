package com.tejas.model;

/**
 * Bike class extending Vehicle.
 * Demonstrates Inheritance and Polymorphism.
 */
public class Bike extends Vehicle {
    public Bike(String brand, String color, int wheels) {
        super(brand, color, wheels);
    }

    @Override
    public void showDetails() {
        System.out.println("🏍️ Bike -> Brand: " + getBrand() + ", Color: " + getColor() + ", Wheels: " + getWheels());
    }
}
