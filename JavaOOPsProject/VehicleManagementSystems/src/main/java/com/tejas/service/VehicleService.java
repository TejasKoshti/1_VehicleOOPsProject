package com.tejas.service;

import com.tejas.model.Bike;
import com.tejas.model.Car;
import com.tejas.model.Truck;
import com.tejas.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * VehicleService demonstrates Polymorphism by storing and processing different types of vehicles.
 */
public class VehicleService {

    public void start() {
        // Creating vehicles (Inheritance)
        Vehicle car = new Car("Maruti", "Red", 4);
        Vehicle bike = new Bike("Yamaha", "Black", 2);
        Vehicle truck = new Truck("Tata", "Blue", 6);

        // Polymorphism: All different vehicle types in one list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        System.out.println("\n📦 Vehicle Details:\n");

        for (Vehicle v : vehicles) {
            v.showDetails(); // Polymorphic behavior
        }
    }
}
