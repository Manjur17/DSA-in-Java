package OOPS.AccessModifiers;

import OOPS.Inheritance.Vehicle;

public class Truck extends Vehicle {
    int maxLoadCapacity;
    int noOfDoors;
    public void printTruck(){
        System.out.println("Vehicle color is " + getColor() + " No of tyres " + noOfTyres + " Company name is " + companyName + " No of doors are " + noOfDoors);
    }

    public static void main(String[] args) {
        Truck t = new Truck();
        //protected can be accessed as Truck class extends Vehicle
        //only the child class and no one else
        t.companyName = "tata";
        t.noOfDoors = 4;
    }
}
