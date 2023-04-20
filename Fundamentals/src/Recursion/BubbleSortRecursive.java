package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRecursive {
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
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int row,int cols){
        if (row == 0){
            return;
        }
        if (cols < row){
            if (arr[cols] > arr[cols+1]){
                getSwap(arr,cols,cols+1);
            }
            bubbleSort(arr,row,cols+1);
        }else {
            bubbleSort(arr,row-1,0);
        }
    }
    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
