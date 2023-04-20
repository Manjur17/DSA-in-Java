package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortRecursive {
    public static int[] arrayFunction(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("Enter the elements:");
        for (int i=0; i<size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void main(String[] args){
        int[] arr = arrayFunction();
        int max = 0;
        selectionSort(arr,arr.length-1,0,max);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int row,int cols,int max){
        if (row == 0){
            return;
        }
        if (cols < row){
            if (arr[cols] > arr[max]) {
                max = cols;
                selectionSort(arr, row, cols + 1,max);
            }else {
                selectionSort(arr, row, cols + 1,max);
            }
        }else {
            getSwap(arr,max,row-1);
            selectionSort(arr,row-1,0,0);
        }
    }
    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
