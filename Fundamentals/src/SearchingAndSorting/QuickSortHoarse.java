package SearchingAndSorting;

import java.util.Scanner;

public class QuickSortHoarse {
    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }
    public static int hoarsePartition(int[] arr,int sI,int eI){
        int pivot = arr[sI];
        int i = sI - 1;
        int j = eI + 1;
        while (true){
            do {
                i++;
            }while (arr[i] < pivot);

            do {
                j--;
            }while (arr[j] > pivot);

            if (i >= j){
                return j;
            }
            swap(arr,i,j);
        }
    }
    public static void quickSort(int[] arr,int sI,int eI){
        if (sI >= eI){
            return;
        }
        int pI = hoarsePartition(arr,sI,eI);
        quickSort(arr,sI,pI);
        quickSort(arr,pI+1,eI);
    }
    public static void quickSort(int[] arr)
    {
        quickSort(arr,0, arr.length - 1);
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
        quickSort(arr);
        for (int x: arr){
            System.out.print(x + " ");
        }
    }
}
