package Recursion;

import java.util.Scanner;

public class FirstIndexOfNumber {
    public static int getIndex(int[] arr,int x,int startIndex){
        if (startIndex == arr.length){
            return -1;
        }
        if (arr[startIndex] == x){
            return startIndex;
        }
        return getIndex(arr,x,startIndex+1);
    }
    public static int getIndex(int[] input,int x){
        return getIndex(input,x,0);
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
        Scanner s=new Scanner(System.in);
        int[] input = arrayFunction();
        System.out.println("Enter the element to be searched:");
        int x =s.nextInt();
        System.out.println(getIndex(input,x));
    }
}
