package Arrays;

import java.util.Scanner;

public class SwapAlternateElements {
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
    public static void alterElements(int[] arr){
        int size=arr.length;
        //more optimised way of writting
        for (int i = 0; i < (size - 1); i+=2){
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = temp;
        }
//        int i = 0, j = i + 1;
//        while (i < size && j < size){
//            int temp = arr[i];
//            arr[i]= arr[j];
//            arr[j] = temp;
//            i+=2;
//            j+=2;
//        }
        for (int input : arr) {
            System.out.print(input + " ");
        }
        System.out.println();
    }

    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            alterElements(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
