package Arrays;

import java.util.Scanner;

public class TripletSum {
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
    public static void tripletSum(int[] arr, int x) {
        int numTriplets=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        System.out.print("(" + arr[i] + "," + arr[j] + "," + arr[j] + ")" + " ");
                        numTriplets++;
                    }
                }
            }
        }
        System.out.println("\n" + "The the total number of pairs in the array/list which sum to X: " + numTriplets);
    }

    public static void resultArr(int t){
        Scanner s=new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            System.out.println("Enter the number whise sums to X:");
            int x=s.nextInt();
            tripletSum(arr,x);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
