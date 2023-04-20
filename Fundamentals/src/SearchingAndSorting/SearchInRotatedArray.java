package SearchingAndSorting;

import java.util.Scanner;

public class SearchInRotatedArray {
    public static int rotatedArraySearch(int[] arr,int x){
        int n = arr.length;
        int startIndex = 0, endIndex = n - 1;
        while (startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;
            if (arr[mid] == x){
                return mid;
            }else if(arr[mid] >= arr[startIndex]){
                //Left Half Sorted
                if (x >= arr[startIndex] && x < arr[mid]){
                    endIndex = mid - 1;
                }else {
                    startIndex = mid + 1;
                }
            }else {
                //Right Half Sorted
                if(x <= arr[endIndex] && x > arr[mid]){
                    startIndex = mid + 1;
                }else {
                    endIndex = mid - 1;
                }
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
        System.out.println("Enter the element to be searched:");
        int x =s.nextInt();
        System.out.println("The element is present at index: " + rotatedArraySearch(input,x));
    }
}
