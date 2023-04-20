package Maths;

import java.util.Scanner;

public class PowerX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 1;
        while (y > 0) {
            ans *= x;
            y--;
        }
        System.out.println(ans);
    }
}
