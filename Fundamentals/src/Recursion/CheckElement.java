package Recursion;

import java.util.Scanner;

public class CheckElement {
    public static boolean checkElement(int[] arr,int x,int startIndex){
        if (startIndex == arr.length){
            return false;
        }
        if (arr[startIndex] == x){
            return true;
        }
        return checkElement(arr,x,startIndex+1);
    }
    public static boolean checkElement(int[] input,int x){
        return checkElement(input,x,0);
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
        System.out.println(checkElement(input,x));
    }
}
