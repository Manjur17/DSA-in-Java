package SearchingAndSorting;

import java.util.Scanner;

public class OptimisedBubbleSort {
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
    public static void bubbleSort(int[] input){
        int size=input.length;
        for (int i = 0; i < (size-1); i++) {
            boolean swapped = false;
            for (int j = 0; j < (size-i-1) ; j++){ // not comparing the last elements bubbled out in every round
                if (input[j+1] < input[j]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped){
                break;
            }
        }
        for (int x: input){
            System.out.print(x + " ");
        }
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            bubbleSort(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
