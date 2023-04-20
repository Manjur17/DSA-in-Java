package Arrays;

import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static int[] arrayFunction(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("The elements of array are:");
//        for (int i=0; i<size; i++){
//            input[i] = s.nextInt();
//        }
        return input;
    }
    public static void arrangeNumbers(int[] arr){
        int startIndex = 0,endIndex = arr.length-1,value = 1;
        while (startIndex <= endIndex){
            if (value % 2 != 0) {
                arr[startIndex] = value;
                value++;
                startIndex++;
            }else {
                arr[endIndex] = value;
                value++;
                endIndex--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " " );
        }
        System.out.println();
    }

    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            arrangeNumbers(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
