package Arrays;

import java.util.Scanner;

public class BarChartPrint {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void barChart(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor){
                    System.out.print("*\t");
                }else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        barChart(arr);
    }
}