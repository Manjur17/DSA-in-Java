package Recursion;

import java.util.Scanner;

public class CheckArraySort {
    //Approach1
    public static boolean checkSorted(int[] arr){
        //Base condition
        if (arr.length <= 1){
            return true;
        }
        //for arr.length > 1
        int[] smallArr =new int[arr.length-1];
        for (int i = 1;i < arr.length;i++){
            smallArr[i-1] = arr[i];
        }
        boolean ans = checkSorted(smallArr);
        if (!ans){
            return false;
        }
        if (arr[0] < arr[1]){
         return true;
        }else {
            return false;
        }
    }
    //Approach2
    public static boolean checkSorted1(int[] arr){
        //Base condition
        if (arr.length <= 1){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }
        //for arr.length > 1
        int[] smallArr =new int[arr.length-1];
        for (int i = 1;i < arr.length;i++){
            smallArr[i-1] = arr[i];
        }
        boolean ans = checkSorted1(smallArr);
        return ans;
//        if (ans){
//            return true;
//        }else {
//            return false;
//        }
    }
    //Better Approach
    public static boolean checkSortedBetter(int[] input, int startIndex){
        if (startIndex == input.length-1){
            return true;
        }
        if (input[startIndex] > input[startIndex+1]){
            return false;
        }
        return checkSortedBetter(input,startIndex+1);
    }
    //Helper Function
    public static boolean checkSortedBetter(int[] input){
        return checkSortedBetter(input,0);
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
        System.out.println("From Approach 1 " + "\n" + checkSorted1(input));
        System.out.println("From Approach 2 " + "\n" + checkSorted1(input));
        System.out.println("From Approach 3 " + "\n" + checkSortedBetter(input));
    }
}
