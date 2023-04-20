package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
    public static int[] takeInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=in.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("Enter the elements:");
        for (int i=0;i< input.length;i++){
            input[i] = in.nextInt();
        }
        return input;
    }
    public static void arrayPractice(int[] arr){
        int nextZero = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 0){
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void resultArray(int t){
        for (int i=0;i < t;i++){
            Scanner in = new Scanner(System.in);
            int[] arr = takeInput();
            arrayPractice(arr);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test you want to perform:");
        int t = in.nextInt();
        resultArray(t);
    }
}
