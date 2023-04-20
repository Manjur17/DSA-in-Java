package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    public static int[] takeInput(){
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
    public static void countSort(int[] arr,int minValue,int maxValue){
        //creating the frequency array
        int[] freqArray = new int[maxValue-minValue+1];
        //updating the frequency of occurrence of an element
        for (int j:arr) {
            freqArray[arr[j]-minValue]++;
        }
        //finding the prefix sum
        for (int i = 1; i < freqArray.length; i++) {
            freqArray[i]  += freqArray[i-1];
        }
        int[] ans = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int index =  freqArray[arr[i] - minValue] - 1;
            ans[index] = arr[i];
            freqArray[arr[i] - minValue]--;
        }
        System.arraycopy(ans, 0, arr, 0, ans.length);
        print(arr);
    }
    public static void countSor1(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] ans = new int[arr.length];
        //make frequency arr
        int[] farr = new int[range];
        for(int i = 0 ; i < arr.length; i++){
            farr[arr[i] - min]++;
        }
        //convert it into prefix sum array
        for(int i = 1 ; i < farr.length; i++){
            farr[i] += farr[i - 1];
        }
        //stable sorting(filling ans array)
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = farr[arr[i] - min] - 1;
            ans[pos] = arr[i];
            farr[arr[i] - min]--;
        }
        //filling original array with the help of ans array
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = ans[i];
        }
        print(arr);
    }
    public static void print(int[] input){
        System.out.println("The elements of arrays are:");
        System.out.println(Arrays.toString(input));
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr =takeInput();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }
        countSort(arr,min,max);
        countSor1(arr,min,max);
    }
}
