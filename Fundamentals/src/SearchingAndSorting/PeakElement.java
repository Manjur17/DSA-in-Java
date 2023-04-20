package SearchingAndSorting;

import java.util.Scanner;

public class PeakElement {
    public static int peakElement(int[] arr){
        int n = arr.length;
        int startIndex = 0, endIndex = n - 1;
        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex)/2;
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n -1 || arr[mid] >= arr[mid + 1])){
                return  arr[mid];
            }
            if (mid > 0 && arr[mid] <= arr[mid + 1]){
                startIndex = mid + 1;
            }else {
                endIndex = mid - 1;
            }
        }
        return -1;
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
        System.out.println("The peak element is: " + peakElement(input));
    }
}
