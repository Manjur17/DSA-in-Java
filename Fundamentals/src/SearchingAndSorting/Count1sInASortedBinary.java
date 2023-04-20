package SearchingAndSorting;

import java.util.Scanner;

public class Count1sInASortedBinary {
    public static int countOnes(int[] arr){
        int n = arr.length;
        int startIndex = 0, endIndex = n - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] == 0) {
                startIndex = mid + 1;
            }else {
                if (mid == 0 || arr[mid-1] != arr[mid]){
                    return (n - mid);
                }else {
                    endIndex = mid - 1;
                }
            }
        }
        return 0;
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
        Scanner s = new Scanner(System.in);
        int[] input = arrayFunction();
        System.out.println("The total nos of 1s are: " + countOnes(input));
    }
}
