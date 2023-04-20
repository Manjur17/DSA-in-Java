package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        int exp = 1;
        while (exp <= max) {
            //first do it for one's place than tens then hundred and so on
            countSort(arr, exp, arr.length);
            exp *= 10;
        }
    }

    private static void countSort(int[] arr, int exp, int n) {
        int[] frequency = new int[10];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            frequency[(arr[i] / exp) % 10]++;
        }
        //find the prefix sum -> no of element <= (min,max)
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            //start from end and place it in output auxiliary array
            int index = frequency[(arr[i] / exp) % 10] - 1;
            output[index] = arr[i];
            frequency[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
