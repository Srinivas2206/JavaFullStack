package com.automobile.FourWheeler;

import com.automobile.Vehicle;

/*
 * Add the following ideas to the previous hands on: 
 * Create FourWheeler subpackage under automobile package
 * 
 * Logan class extends com.automobile.Vehicle class
 * public int speed()– Returns the current speed of the vehicle.
 * public int gps() – provides facility to control the gps device 
 * 
 * Ford class extends com.automobile.Vehicle class
 * public int speed()– Returns the current speed of the vehicle.
 * public int tempControl() – provides facility to control the air conditioning device which is available in the car
 * 
 * Create objects of the relevant classes and test the various functionalities of the class.
 */
public class Ford extends Vehicle {
    public Ford(String ownerName, String modelName, String registrationNumber, int speed) {
        this.modelName = modelName;
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.speed = speed;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int speed() {
        return this.speed;
    }

    public int tempControl() {
        return 0;
    }
}
