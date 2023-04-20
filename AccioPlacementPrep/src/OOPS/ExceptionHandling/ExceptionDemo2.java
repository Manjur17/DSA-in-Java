package OOPS.ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static int factorial(int n) throws NegativeNumberFactorialException {
        if (n < 0){
            throw new NegativeNumberFactorialException();
        }
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0){
            throw new DivideByZeroException("Not Possible to divide by 0");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int a = s.nextInt();
        System.out.println("Enter the divisor");
        int b = s.nextInt();
        System.out.println("Enter the number whose factorial is to be found");
        int n = s.nextInt();
        try {
            System.out.println("The Answer after division is: " + divide(a,b));
            System.out.println("The factorial of " + n + " is: " + factorial(n));
            System.out.println("Try is executed as no exception is raised");
        } catch (DivideByZeroException e) {
            //Catch is executed as an exception is raised
            System.out.println("Divide By Zero Exception is Raised!!!");
        } catch (NegativeNumberFactorialException e) {
            System.out.println("Negative Number Factorial Exception is Raised!!!");
        } catch (Exception e){
            System.out.println("Generic Exception");
        } finally {
            System.out.println("Finally is always executed!!!");
        }
        System.out.println("Execution of main continues.....");
    }
}
