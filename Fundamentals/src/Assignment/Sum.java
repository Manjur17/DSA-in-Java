package Assignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        sum = (n*(n-1))/2;
        System.out.println(sum);
    }
}
