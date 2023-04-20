package SearchingAndSorting;

import java.util.Scanner;

public class SquareRoot {
    public static int getSquareRoot(int x){
        int start = 1,end = x;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end)/2;
            int midSquare = mid * mid;
            if (midSquare == x) {
                return mid;
            } else if (midSquare > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int x =s.nextInt();
        System.out.println("The square root of " + x + " is: " + getSquareRoot(x));
    }
}
