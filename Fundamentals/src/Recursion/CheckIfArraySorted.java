package Recursion;

import java.util.Scanner;

public class CheckIfArraySorted {
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

    public static boolean checkSortedArray(int[] arr,int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index] <= arr[index+1] && checkSortedArray(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr = arrayFunction();
        System.out.println(checkSortedArray(arr,0));
    }
}
