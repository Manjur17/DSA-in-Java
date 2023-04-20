package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort12N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        cyclicSort12N(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort12N(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
