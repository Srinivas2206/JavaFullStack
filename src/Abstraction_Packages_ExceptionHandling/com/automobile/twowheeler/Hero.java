package com.automobile.twowheeler;

import com.automobile.Vehicle;

/*
 * Create twowheeler subpackage under automobile package
 * Hero class extends automobile.vehicle class with the following methods
 * public int getSpeed() – returns the current speed of the vehicle.
 * public void radio() – provides facility to control the radio device 
 */
public class Hero extends Vehicle {

    public Hero(String ownerName, String modelName, String registrationNumber, int speed) {
        this.ownerName = ownerName;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.speed = speed;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {

    }
}
