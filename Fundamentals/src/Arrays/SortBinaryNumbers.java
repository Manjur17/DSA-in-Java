package Arrays;

import java.util.Scanner;

public class SortBinaryNumbers {
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
    public static void sortBinary2(int[] arr) {
        int nextZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero +=1;
            }
        }
        System.out.println();
        for (int input : arr) {
            System.out.print(input + " ");
        }
    }
    public static void sortBinary1(int[] arr) {
        int count =0;
        for (int i = 0; i < (arr.length-1); i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    System.out.print(arr[i] + " ");
                    count++;
                    break;
                }
            }
        }
        for (int j=0; j < (arr.length-count); j++){
                int temp=1;
                System.out.print(temp + " ");
        }
    }

    public static void resultArr(int t){
        Scanner s=new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            sortBinary1(arr);
            sortBinary2(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
