package BitManipulation;

import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int xor = 0;

        for (int x : nums) {
            xor ^= x;
        }

        return xor;
    }
}
