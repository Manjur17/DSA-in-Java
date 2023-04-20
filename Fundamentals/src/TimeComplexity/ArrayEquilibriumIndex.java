package TimeComplexity;

import java.util.Scanner;

public class ArrayEquilibriumIndex {
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
    public static int equilibriumIndex(int[] arr){
        int totalSum = 0; int leftSum = 0, rightSum = 0, index = 0;
        //Approach 1
        for (int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        while (index < arr.length){
            rightSum = totalSum - leftSum - arr[index];
            if (rightSum == leftSum){
                return index;
            }else {
                leftSum += arr[index];
            }
            index++;
        }
        return  -1;
    }
    public static int equilibriumIndex1(int[] arr){
        int leftSum = 0, rightSum = 0;
        //Approach 2
        for (int i = 0; i < arr.length; i++){
            rightSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            rightSum -= arr[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            System.out.println(equilibriumIndex(arr));
            System.out.println(equilibriumIndex1(arr));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
