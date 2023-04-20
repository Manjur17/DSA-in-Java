package Recursion;

import java.util.Scanner;

public class RBS {
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
    public static int rotatedBinarySearch(int[] arr,int target,int start,int end){
        if (start > end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if (target == arr[mid]){
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, start, mid-1);
            } else {
                return rotatedBinarySearch(arr, target, mid+1, end);
            }
        }

        if (arr[start] >= arr[mid] && target >= arr[mid] && target <= arr[end]) {
            return rotatedBinarySearch(arr, target, mid+1, end);
        }

        return rotatedBinarySearch(arr, target, start, mid-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr = arrayFunction();
        int target = s.nextInt();
        System.out.println(rotatedBinarySearch(arr,target,0, arr.length-1));
    }
}
