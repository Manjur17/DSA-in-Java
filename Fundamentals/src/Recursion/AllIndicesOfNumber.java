package Recursion;

import java.util.Scanner;

public class AllIndicesOfNumber {
    public static int[] getIndex(int[] arr,int x,int startIndex,int fsf){
        if (startIndex == arr.length){
            return new int[fsf];
        }
        if (arr[startIndex] == x){
           int[] smallAns = getIndex(arr,x,startIndex+1,fsf+1);
           smallAns[fsf] = startIndex;
           return smallAns;
        }else {
            int[] smallAns = getIndex(arr,x,startIndex+1,fsf);
            return smallAns;
        }
    }
    public static int[] getIndex(int[] input,int x){
        return getIndex(input,x,0,0);
    }
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
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] input = arrayFunction();
        System.out.println("Enter the element to be searched:");
        int x =s.nextInt();
        int[] ans = getIndex(input,x);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
