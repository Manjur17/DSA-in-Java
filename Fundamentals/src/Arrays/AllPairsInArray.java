package Arrays;

import java.util.Scanner;

public class AllPairsInArray {
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
        for (int i = 0; i < arr.length; i++){
            for (int j=i+1;j < arr.length;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
            }
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
