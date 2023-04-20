package BackTracking;

import java.util.Scanner;

public class WaysToFormNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n, 1));
    }

    public static int solve(int n, int i) {
        if (n == 0) return 1;
        if (i > n) return 0; //n < 0

        int left = solve(n - i, i + 1); //take it
        int right = solve(n, i + 1); //leave it

        return left + right;
    }
}
