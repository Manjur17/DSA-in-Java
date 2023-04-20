package SearchingAndSorting;

import java.util.Scanner;

public class CountOccurrenceInArray {
    //First Occurrence
    public static int firstOccur(int[] arr,int x){
        int n = arr.length;
        int startIndex = 0, endIndex = n - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (x > arr[mid]) {
                startIndex = mid + 1;
            } else if (x < arr[mid]){
                endIndex = mid - 1;
            }else {
                if (mid ==0 || arr[mid-1] != arr[mid]){
                    return mid;
                }else {
                    endIndex = mid - 1;
                }
            }
        }
        return -1;
    }
    //Last Occurrence
    public static int lastOccur(int[] arr,int x){
        int n = arr.length;
        int startIndex = 0, endIndex = n - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (x > arr[mid]) {
                startIndex = mid + 1;
            } else if (x < arr[mid]){
                endIndex = mid - 1;
            }else {
                if (mid == arr.length-1 || arr[mid+1] != arr[mid]){
                    return mid;
                }else {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }
    public static int countOccurrence(int[] arr,int x){
        int first = firstOccur(arr,x);
        if (first == -1){
            return 0;
        }else {
            return ((lastOccur(arr,x) - first) + 1);
        }
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
        System.out.println("The total number of occurrences of " + x + " is: " + countOccurrence(input,x));
    }
}
