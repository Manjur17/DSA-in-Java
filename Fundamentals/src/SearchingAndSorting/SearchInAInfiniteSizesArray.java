package SearchingAndSorting;

import java.util.Scanner;

public class SearchInAInfiniteSizesArray {
    public static int binarySearch(int[] arr,int x,int startIndex,int endIndex){
        while (startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;
            if (arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                startIndex = mid + 1;
            }else {
                endIndex = mid - 1;
            }
        }
        return -1;
    }
    public static int infiniteSearch(int[] arr,int x){
        if (arr[0] == x){
            return 0;
        }
        int i = 1;
        while (arr[i] < x){
            i = i * 2;
            if (arr[i] == x){
                return  i;
            }
        }
        return  binarySearch(arr,x,i/2+1,i-1);
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
        System.out.println("The element is present at index: " + infiniteSearch(input,x));
    }
}
