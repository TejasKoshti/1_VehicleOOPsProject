package com.tejas.model;

/**
 * Abstract class representing a generic Vehicle.
 * Demonstrates Abstraction and Encapsulation.
 */
public abstract class Vehicle {
    private String brand;
    private String color;
    private int wheels;

    public Vehicle(String brand, String color, int wheels) {
        this.brand = brand;
        this.color = color;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    // Abstract method forces child classes to implement
    public abstract void showDetails();
}
