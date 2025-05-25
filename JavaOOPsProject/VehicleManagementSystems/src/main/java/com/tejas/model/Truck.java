package com.tejas.model;
/**
 * Truck class extending Vehicle.
 * Demonstrates Inheritance and Polymorphism.
 */
public class Truck extends Vehicle {

    public Truck(String brand, String color, int wheels) {
        super(brand, color, wheels);
    }

    @Override
    public void showDetails() {
        System.out.println("🚚 Truck -> Brand: " + getBrand() + ", Color: " + getColor() + ", Wheels: " + getWheels());
    }
}