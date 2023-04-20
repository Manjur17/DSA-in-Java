package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
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
    public static void sumOfTwoArrays(int[] arr1, int[] arr2,int[] ans){
       int i = arr1.length - 1;
       int j = arr2.length - 1;
       int k = ans.length - 1;
       int carry = 0;
       while (i >= 0 && j >= 0 ){
          int sum = arr1[i] + arr2[j] + carry;
          ans[k] = sum % 10;
          carry = sum / 10;
          i--;
          j--;
          k--;
       }
       while (i >= 0){
           int sum = arr1[i] +  carry;
           ans[k] = sum % 10;
           carry = sum / 10;
           i--;
           k--;
       }
       while (j >= 0){
           int sum =  arr2[j] + carry;
           ans[k] = sum % 10;
           carry = sum / 10;
           j--;
           k--;
       }
        ans[0] = carry;
        System.out.println(Arrays.toString(ans));
        System.out.println();
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr1 = arrayFunction();
            int[] arr2 = arrayFunction();
            int[] ans = new int[Math.max(arr1.length, arr2.length) + 1];
            sumOfTwoArrays(arr1,arr2,ans);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
