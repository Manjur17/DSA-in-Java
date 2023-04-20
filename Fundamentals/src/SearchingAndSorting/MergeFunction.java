package SearchingAndSorting;

import java.util.Scanner;

public class MergeFunction {
    public static int[] mergeSortArray(int[] arr,int low,int high) {
        int mid = low + (high - low)/2;
        int m = (mid - low) + 1;
        int n = high - mid;
        int[] left = new int[m];
        int[] right = new int[n];
        for (int i = 0; i < m; i++){
            left[i] = arr[i];
        }
        for (int i = 0; i < n; i++){
            right[i] = arr[m+i];
        }
        int i = 0,j = 0,k = 0;
        while (i < m && j < n) {
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < m ){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }

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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = arrayFunction();
        System.out.println("Enter the value of low:");
        int low = s.nextInt();
        System.out.println("Enter the value of high:");
        int high = s.nextInt();
        int[] ans = mergeSortArray(arr,low,high);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
