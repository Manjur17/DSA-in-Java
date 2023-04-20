package SearchingAndSorting;

import java.util.Scanner;

public class PartitioningAnArray {
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
    public static void arrayPartition(int[] arr,int pivot){
        int i=0,j=0,temp=0;
        while (i < arr.length){
            if (arr[i] <= pivot){
                if (arr[i] == pivot){
                    temp=j;
                }
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        swap(arr,temp,j-1);
        print(arr);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] input){
        int size=input.length;
        System.out.println("The elements of arrays are:");
        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr= takeInput();
        int pivot = s.nextInt();
        arrayPartition(arr,pivot);

    }
}
