package OOPS.Inheritance;

import OOPS.Generics.Printable;

public class Vehicle implements Printable {
    protected int noOfTyres;
    protected String companyName;
    private String color;

    public Vehicle(String companyName, int noOfTyres) {
//        System.out.println("Vehicle's Constructor is called");
        this.companyName = companyName;
        this.noOfTyres = noOfTyres;
    }

    public Vehicle() {
        System.out.println("Vehicle's Constructor is called");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Vehicle color is " + color + " No of tyres " + noOfTyres + " Company name is " + companyName);
    }
}
