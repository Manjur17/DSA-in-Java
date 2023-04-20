package OOPS.ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0){
            //our own exception
            throw new DivideByZeroException("Not Possible to divide by 0");
        }
        return a/b;
    }

    public static void main(String[] args) throws DivideByZeroException {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(divide(a,b));
        System.out.println("normal code.........");
    }
}
