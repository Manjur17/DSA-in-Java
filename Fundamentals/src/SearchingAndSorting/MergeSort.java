package SearchingAndSorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr,int startIndex,int endIndex){
     if (startIndex >= endIndex){
         return;
     }
     int mid = startIndex + (endIndex - startIndex)/2;
        //PART - 1
     mergeSort(arr,startIndex,mid);
        //PART - 2
     mergeSort(arr,mid+1,endIndex);
        //Merge PART-1 And PART - 2
     mergeArray(arr,mid,startIndex,endIndex);
    }
    public static void mergeSort(int[] arr){
        mergeSort(arr,0, arr.length-1);
    }
    public static void mergeArray(int[] arr,int mid,int sI,int eI) {
//        int mid = sI + (eI - sI) / 2;
        int[] ans = new int[eI - sI + 1];
        int i = sI, j = mid + 1, k = 0;
        while (i <= mid && j <= eI) {
            if (arr[i] <= arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            }else{
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j <= eI){
            ans[k] = arr[j];
            j++;
            k++;
        }
//        for (int l = 0; l < ans.length; l++) {
//            arr[sI + l] = ans[l];
//        }
        for (int a = sI; a <= eI; a++){
            arr[a] = ans[a - sI];
        }
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
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
