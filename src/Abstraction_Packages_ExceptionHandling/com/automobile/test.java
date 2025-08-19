package com.automobile;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

/*
 * Create a package called com.automobile. 
 * Define an abstract class called Vehicle. 
 * Vehicle class has the following abstract methods: 
 * public String getModelName() 
 * public String getRegistrationNumber() 
 * public String getOwnerName() 
 * 
 * Create twowheeler subpackage under automobile package
 * Hero class extends automobile.vehicle class with the following methods
 * public int getSpeed() – returns the current speed of the vehicle.
 * public void radio() – provides facility to control the radio device 
 * 
 * Honda class extends com.automobile.vehicle class with the following methods
 * public int getSpeed()– Returns the current speed of the vehicle.
 * public void cdplayer() – provides facility to control the cd player device which is available in the car.
 * Create a test class to test the methods available in all these child class.
 * 
 * 
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

public class test {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Hero("ViratKohli", "Hero", "1818", 50);
        Vehicle vehicle2 = new Honda("Abd", "Honda", "1717", 60);

        System.out.println(vehicle1.getOwnerName());
        System.out.println(vehicle1.getModelName());
        System.out.println(vehicle1.getRegistrationNumber());
        System.out.println(((Hero) vehicle1).getSpeed());

        System.out.println(vehicle2.getOwnerName());
        System.out.println(vehicle2.getModelName());
        System.out.println(vehicle2.getRegistrationNumber());
        System.out.println(((Honda) vehicle2).getSpeed());

        Vehicle vehicle3 = new Logan("Rahul", "Logan", "0101", 80);
        Vehicle vehicle4 = new Ford("Hardik", "Ford", "1718", 90);

        System.out.println(vehicle3.getOwnerName());
        System.out.println(vehicle3.getModelName());
        System.out.println(vehicle3.getRegistrationNumber());
        System.out.println(((Logan) vehicle3).speed());

        System.out.println(vehicle4.getOwnerName());
        System.out.println(vehicle4.getModelName());
        System.out.println(vehicle4.getRegistrationNumber());
        System.out.println(((Ford) vehicle4).speed());
    }
}
