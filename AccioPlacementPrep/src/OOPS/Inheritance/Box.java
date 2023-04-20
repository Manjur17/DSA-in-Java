package OOPS.Inheritance;

public class Box {
    private final double length;  //Data hiding
    double height;
    double width;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public double getLength() {
        //using getting and setters to access private data but cannot/shouldn't be able to modify it
        //so that data hiding can be achieved
        return length;
    }

    //constructor overloading
    //if we don't use super() inside child class constructor then this default constructor is called
    //if we remove this default constructor it gives ERROR
    Box () {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    // cube
    Box (double side) {
        // super(); Object class
        this.width = side;
        this.length = side;
        this.height = side;
    }

    Box(double length, double height, double width) {
        System.out.println("Box class constructor");
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(Box old) {
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }
}
