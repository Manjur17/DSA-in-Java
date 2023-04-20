package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateArray(arr, n, k);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    //anti-clockwise
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if (k >= n) {
            k %= n;
        }

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = temp[i];
        }
    }

    public void rotateConstantSpace(int[] arr, int k) {
        int n = arr.length;
        if (k >= n) {
            k %= n;
        }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    //clockwise
    private static void rotateArray(int[] arr, int n, int k) {
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
