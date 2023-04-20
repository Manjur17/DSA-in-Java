package Fundamentals;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fruit = s.nextLine();
        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "apple" -> System.out.println("A sweet of fruit");
            case "orange" -> System.out.println("A fruit");
            case "grapes" -> System.out.println("A small fruit");
            default -> System.out.println("Enter a valid fruit");
        }

        //Nested switch cases
        int empID = s.nextInt();
        String department = s.next();
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
