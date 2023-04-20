package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Squares();

        circle.area();
        square.area();

        //Same output no overriding happens
        //as static does not depend on objects
        //but overriding depends on the type of the object being created
        //so use class name instead of object references to access the static methods/variable
        Shapes.greeting();
        Shapes.greeting();
    }
}
