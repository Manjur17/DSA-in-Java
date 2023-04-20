package OOPS.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

//  @Override -> ERROR
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
//        ArrayList list = new ArrayList();
    }

    BoxWeight (BoxWeight other) {
        //here it means Box old = other(new BoxWeight object)
        //clearly BoxWeight has access to properties of Box class(super class)
        //so no problem/error
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        // used to initialise values present in parent class
        super(length, height, width); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }
}
