package OOPS.AccessModifiers;

import OOPS.Inheritance.Vehicle;

public class VehicleUse extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setColor("Red");
//        v.companyName = "Honda";   -> ERROR as only the subclass can access the protected variables(Not even the parent)
        //as the parent doesn't know who is below it but subclass knows who is above it.
        v.print();

        Truck t = new Truck();
        t.setColor("Green");
        t.noOfDoors = 2;
//        t.noOfTyres = 4; -> ERROR same above explanation

        VehicleUse vu = new VehicleUse();
        //protected can be accessed as Main class extends Vehicle
        //only the child class and no one else
        vu.companyName = "Ashok Leyland";
        vu.noOfTyres = 6;


        t.printTruck();
        t.print();
    }

}
