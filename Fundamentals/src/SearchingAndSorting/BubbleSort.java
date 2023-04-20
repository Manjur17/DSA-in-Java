package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static int[] takeInput(){
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

    public static void bubbleSort(int[] arr){
        boolean isSwapped = false;
        // run the steps n-1 times
        for (int i =0;i < arr.length-1;i++){
            // for each step, max item will come at the last respective index
            for (int j =0;j< arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    // swap if the item is smaller than the previous item
                    getSwap(arr, j);
                    isSwapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted now hence stop the program
            if (!isSwapped){  // !false = true
                break;
            }
        }
        print(arr);
    }

    public static void getSwap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public static void print(int[] input){
        int size=input.length;
        System.out.println("The elements of arrays are:");
        System.out.println(Arrays.toString(input));
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr =takeInput();
        bubbleSort(arr);
    }
}
