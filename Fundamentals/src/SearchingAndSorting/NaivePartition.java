package SearchingAndSorting;

import java.util.Scanner;

public class NaivePartition {
    public static void naivePartition(int[] arr,int sI,int eI,int posI){
        int[] temp = new int[eI - sI + 1];
        int index = 0;
        for (int i = sI; i <= eI; i++){
            if (arr[i] <= arr[posI]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = sI; i <= eI; i++){
            if (arr[i] > arr[posI]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = sI; i <= eI; i++){
            arr[i] = temp[i - sI];
        }
    }
    public static void naivePartition(int[] arr,int pI){
        naivePartition(arr,0, arr.length - 1,pI);
    }
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = arrayFunction();
        System.out.println("Enter the position Index:");
        int pI = s.nextInt();
        naivePartition(arr,pI);
        for (int x: arr){
            System.out.print(x + " ");
        }
    }
}
