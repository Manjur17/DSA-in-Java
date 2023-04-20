package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearchRecusive {
    public static int binarySearch(int[] arr,int x,int startIndex, int endIndex) {
       if (startIndex > endIndex){
           return -1;
       }
       int mid = (startIndex + endIndex)/2;
       if (arr[mid] == x){
           return mid;
       }else if (arr[mid] < x){
           return binarySearch(arr,x,mid+1,endIndex);
       }else {
           return binarySearch(arr,x,startIndex,mid-1);
       }
    }
    public static int binarySearch(int[] arr,int x){
        return binarySearch(arr,x,0,arr.length-1);
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
        System.out.println("The element is present at index: " + binarySearch(input,x));
    }
}
