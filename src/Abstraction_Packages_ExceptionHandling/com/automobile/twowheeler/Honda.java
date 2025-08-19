package com.automobile.twowheeler;

import com.automobile.Vehicle;

/*
 * Honda class extends com.automobile.vehicle class with the following methods
 * public int getSpeed()– Returns the current speed of the vehicle.
 * public void cdplayer() – provides facility to control the cd player device which is available in the car.
 */
public class Honda extends Vehicle {

    public Honda(String ownerName, String modelName, String registrationNumber, int speed) {
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

    public void cdplayer() {

    }

}
