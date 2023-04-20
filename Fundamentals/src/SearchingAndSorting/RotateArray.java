package SearchingAndSorting;

import java.util.Scanner;

public class RotateArray {
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
    //APPROACH 1
    public static void rotateArray(int[] input, int d) {
        if (input.length == 0) {
            return;
        }
        if (d >= input.length && input.length != 0) {
            d %= input.length;
        }
        for (int i = 0; i < d; i++) {
                int j = 0;
                int temp = input[j];
                while (j < (input.length - 1)) {
                    input[j] = input[j + 1];
                    j++;
                }
                input[j] = temp;
        }
        for (int x : input) {
                System.out.print(x + " ");
        }
        System.out.println();
    }
    //APPROACH 2
    public static void swapElements(int[] arr1, int start, int end){
        int temp = arr1[start];
        arr1[start] = arr1[end];
        arr1[end] = temp;
    }
    public static void  reverseArray(int[] arr1, int start, int end){
        while (start < end){
            swapElements(arr1,start,end);
            end--;
            start++;
        }
    }
    public static void rotateArray1(int[] arr1, int d){
        if (arr1.length == 0){
            return;
        }
        if (d >= arr1.length && arr1.length !=0){
            d  %= arr1.length;
        }
        reverseArray(arr1,0, arr1.length-1);
        reverseArray(arr1,0,arr1.length-d-1);
        reverseArray(arr1, arr1.length -d,arr1.length-1);
        for (int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void resultArr(int t){
        Scanner s =new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            System.out.println("Enter the the value of 'D' by which the array/list needs to be rotated(towards the left):");
            int d = s.nextInt();
            rotateArray(arr,d);
            int[] arr1 = arrayFunction();
            rotateArray1(arr1,d);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
