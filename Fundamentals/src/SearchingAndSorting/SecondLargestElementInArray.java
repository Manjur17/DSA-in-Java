package SearchingAndSorting;

import java.util.Scanner;

public class SecondLargestElementInArray {
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
    public static void secondLargestElementInArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println();
        }
       int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] > secondLargest && largest != arr[i]){
                secondLargest = arr[i];
            }
        }
            System.out.println("The second largest element in the array is: " + secondLargest);
    }

    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            secondLargestElementInArray(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
