package Recursion;

import java.util.Scanner;

public class SumOfArray {
    public static int getSum(int[] arr,int startIndex){
        if (startIndex == arr.length){
            return 0;
        }
        return arr[startIndex] + getSum(arr,startIndex+1);
    }
    public static int getSum(int[] input){
        return getSum(input,0);
    }
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
    public static void main(String[] args) {
        int[] input = arrayFunction();
        System.out.println(getSum(input));
    }
}
