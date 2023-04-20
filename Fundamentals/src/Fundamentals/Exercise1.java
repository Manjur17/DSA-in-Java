package Fundamentals;

public class Exercise1 {
    public static void main(String[] args) {
        int a =50;
        int b=Integer.MIN_VALUE;
//        if ((a/0)==b)  //condition is checked, and we find compile time error
        if ((a/2)==b)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }
    }
}
