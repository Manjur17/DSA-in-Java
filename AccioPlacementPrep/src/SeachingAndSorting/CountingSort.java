package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        int range = max - min + 1;
        int[] frequency = new int[range];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            frequency[arr[i] - min]++;
        }
        //find the prefix sum -> no of element <= (min,max)
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            //start from end and place it in output auxiliary array
            int index = frequency[arr[i] - min] - 1;
            output[index] = arr[i];
            frequency[arr[i] - min]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
