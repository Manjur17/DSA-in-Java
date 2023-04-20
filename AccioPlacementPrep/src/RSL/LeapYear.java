package RSL;

import java.util.Scanner;

public class LeapYear {
    static int isLeap(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0))
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isLeap = false;
        //if n is divisible by 4
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                //if it is a century year it should be divisible by 400 to be a leap year
                isLeap = n % 400 == 0;
            } else {
                // if the year is not century
                isLeap = true;
            }
        }
        if (isLeap) {
            System.out.println("Yes " + n + " is a leap year");
        } else {
            System.out.println("No " + n + " is not a leap year");
        }
    }
}
