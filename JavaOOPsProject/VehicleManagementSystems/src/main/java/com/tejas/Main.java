package com.tejas;

import com.tejas.service.VehicleService;

/**
 * Main class - Entry point of the application
 */
public class Main {
    public static void main(String[] args) {
        VehicleService service = new VehicleService();
        service.start();
    }
}