package SearchingAndSorting;

import java.util.Scanner;

public class MergeSortedArrays {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void mergeSortArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }

    public static void resultArr(int t) {
        for (int i = 1; i <= t; i++) {
            int[] arr1 = arrayFunction();
            int[] arr2 = arrayFunction();
            mergeSortArray(arr1, arr2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t = s.nextInt();
        resultArr(t);
    }
}