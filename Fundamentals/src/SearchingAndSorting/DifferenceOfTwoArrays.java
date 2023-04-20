package SearchingAndSorting;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
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

    public static void diffArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] diff = new int[n2];
        int c = 0, i = arr1.length - 1, j = arr2.length-1, k = diff.length - 1;
        while (k >= 0) {
            int a1value = i >= 0 ? arr1[i] : 0;
            int difference = 0;
            if (arr2[j] + c >= a1value) {
                difference = arr2[j] + c - a1value;
                c =0 ;
            } else {
                difference = arr2[j] + c + 10 - a1value;
                c = -1;
            }
            diff[k] = difference;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.print(diff[idx] + " ");
            idx++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = arrayFunction();
        int[] arr2 = arrayFunction();
        diffArray(arr1, arr2);
    }
}
