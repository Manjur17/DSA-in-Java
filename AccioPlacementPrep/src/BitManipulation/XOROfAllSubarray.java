package BitManipulation;

import java.util.Scanner;

public class XOROfAllSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(gameOfXor(n, arr));
    }

    static int gameOfXor(int n, int[] arr) {
        if (n % 2 == 0)
            return 0;

        int ans = 0;
        for (int i = 0; i < n; i = i + 2) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
