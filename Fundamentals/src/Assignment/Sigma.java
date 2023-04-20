package Assignment;

import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow((i + 1),2) - (3L *i + 1) + i;
        }
        System.out.println(sum);
    }
}
