package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueElement {
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
    //Approach 1
    public static int findUnique(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        for (int i =0 ; i < n-1; i += 2){
            if (arr[i] != arr[i+1]){
                return  arr[i];
            }
        }
       return arr[n-1];
    }
    //Approach 2
    public static int findUnique1(int[] arr){
        int xor = 0;
        for (int i =0 ; i < arr.length; i++){
            xor ^= arr[i];
        }
        return xor;
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
//            System.out.println(findUnique(arr));
            System.out.println(findUnique1(arr));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
