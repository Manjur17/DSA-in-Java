package Arrays;

import java.util.Scanner;

public class LinearSearch {
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
    public static boolean linearSearch2(int[] arr,int target){
        if (arr.length == 0){
             return false;
        }
        for (int j : arr) {
            if (target == j) {
                return true;
            }
        }
        return false;
    }
    public static void linearSearch1(int[] arr,int target){
        if (arr.length == 0){
            return;
        }
        int flag = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if(target == arr[i]){
                flag = i;
                break;
            }
        }
        if(flag != Integer.MAX_VALUE) {
            System.out.println("The target " + target + " is found at index no " + flag);
        }else{
            System.out.println("Target element not found");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr = arrayFunction();
        System.out.println("Enter the number you want to search:");
        int target = s.nextInt();
        linearSearch1(arr,target);
        System.out.println(linearSearch2(arr,target));
    }
}
