package BitManipulation;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isOdd(int n){
        return (n & 1) == 0 ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isOdd(n));
    }
}
