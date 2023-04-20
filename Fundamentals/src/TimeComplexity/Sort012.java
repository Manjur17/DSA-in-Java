package TimeComplexity;

import java.util.Scanner;

public class Sort012 {
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
    public static void sort012(int[] arr) {
        int j = 0; //0 to j-1 -> 0's area
        int i = 0; //j to i-1 -> 1's area
        int k = arr.length-1; //i - k -> 2's area
        while (i <=k){
            if (arr[i] == 0){
                getSwap(arr,i,j);
                i++;
                j++;
            }else if (arr[i] == 2){
                getSwap(arr,i,k);
                k--;
            }else{
                i++;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            sort012(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
