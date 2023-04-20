package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.9);
        box1.getLength();  //using getting and setters to access private data of a class
        Box box2 = new Box(box1); //copy constructor type
//        System.out.println(box1.w + " " + box1.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box3.height + " " + box3.weight);
        System.out.println(box4.height + " " + box4.weight);

        Box box5 = new BoxWeight(2, 3, 4, 8);

//        System.out.println(box5.weight); ERROR -> Only variables that are specific to parent class can be accessed
        //here weight variable specific to child class cannot be accessed in this case


        /*
         BoxWeight box6 = new Box(2, 3, 4); ERROR
         System.out.println(box6);
         this also means, that the ones you are trying to access should be initialised
         but here, when the obj itself is of type parent class, how will you call the constructor of child class
         this is why error
        */

//        Box.greeting();

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but you cannot override
    }
}
