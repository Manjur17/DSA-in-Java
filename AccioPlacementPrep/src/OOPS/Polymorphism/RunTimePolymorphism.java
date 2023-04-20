package OOPS.Polymorphism;

public class RunTimePolymorphism {
    //Method overloading -> decided at compile time

    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        RunTimePolymorphism obj = new RunTimePolymorphism();

        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(1, 3, 7));
        System.out.println(obj.sum(2.235, 56));

    }
}
