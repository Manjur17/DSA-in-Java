package TimeComplexity;

import java.util.Scanner;

public class DuplicateInArray {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }
    public static int findDuplicate(int[] arr){
        int sumOfNMinusTwo = 0, sumOfElements = 0;
        for (int i = 0; i < arr.length - 1;i++){
            sumOfNMinusTwo += i;
        }
        for (int i = 0; i < arr.length;i++){
            sumOfElements += arr[i];
        }
        return (sumOfElements - sumOfNMinusTwo);
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            System.out.println(findDuplicate(arr));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
