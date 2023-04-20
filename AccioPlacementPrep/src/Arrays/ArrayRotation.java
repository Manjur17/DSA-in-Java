package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotateFunc(arr, k);
    }

    private static void rotateFunc(int[] arr, int k) {
        if (k >= arr.length) {
            k %= arr.length;
        }

        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[(i + k) % arr.length] = temp[i];
        }

    }
}
