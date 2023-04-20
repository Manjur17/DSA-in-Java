package Arrays;

import java.util.Scanner;

public class ArrayBasics {
    //creating a function for taking elements as inputs for array
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i=0; i<size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void print(int[] input){
        int size=input.length;
        System.out.println("The elements of arrays are:");
        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    //Finding Largest Element In array
    public static int largestArrayElement(int[] input){
        int size=input.length;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < size; i++){
            if(max < input[i]){
                max = input[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr =takeInput();
        print(arr);
        int size = arr.length;
        int  max =1;
        for (int i = 0; i < size; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The Largest elements using main is: "+ max);
        int largestElement = largestArrayElement(arr);
        System.out.println("The Largest elements using function is: "+ largestElement);
    }
}
