package OOPS.Miscellaneous;

import java.util.Arrays;

class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }
    //copy constructor
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//        this.arr = other.arr;
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy
//        return super.clone();
//    }

    // Assign the shallow copy to the new reference variable twin
//    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        Human twin = (Human)super.clone(); // this is actually shallow copy

        // Creating a deep copy for twin
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Kunal Kushwaha");
//        Human twin = new Human(kunal);

        Human twin = (Human)kunal.clone(); //Object cloning
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        twin.age = 10;
        twin.name = "Ali";
        System.out.println(twin.name);
        System.out.println(kunal.name);
        System.out.println(kunal.age);
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));
    }
}
