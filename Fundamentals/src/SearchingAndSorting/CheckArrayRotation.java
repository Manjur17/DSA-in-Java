package SearchingAndSorting;

import java.util.Scanner;

public class CheckArrayRotation {
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
    //NOTE: Given Array is Sorted Array in increasing order
    public static void checkArrayRotation(int[] arr){
        for (int i =0 ; i < (arr.length-1) ; i++){
            if (arr[i] > arr[i+1]){
                System.out.println("The index from which which the array/list has been rotated is: " + (i+1));
            }
        }
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            checkArrayRotation(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
