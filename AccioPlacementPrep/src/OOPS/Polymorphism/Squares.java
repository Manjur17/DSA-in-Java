package OOPS.Polymorphism;

public class Squares extends Shapes{
    void area() {
        System.out.println("Area is square of side");
    }

    //@Override -> ERROR
    static void greeting(){
        //this will not get overridden
        System.out.println("I am inside Squares");
    }
}
