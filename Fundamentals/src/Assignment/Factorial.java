package Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        while (n > 0){
            ans = ans * n;
            n--;
        }
        System.out.println(ans);
    }
}
