package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
        //creating a function for taking elements as inputs for array
        public static int[] arrayFunction() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int size = s.nextInt(); // asking the size of array to be created
            int[] input = new int[size]; //creating the array
            for (int i = 0; i < size; i++) {
                input[i] = s.nextInt();
            }
            return input;
    }
    public static void intersectionArray(int[] arrN, int[] arrM) {
        if (arrM.length == 0 || arrN.length == 0){
            return;
        }
        Arrays.sort(arrM);
        Arrays.sort(arrN);
        System.out.println("The Intersection elements in a row:");
        int i = 0, j = 0;
        while (i < arrN.length && j < arrM.length) {
            if (arrN[i] == arrM[j]) {
                System.out.print(arrN[i] + " ");
                i++;
                j++;
            } else if (arrN[i] < arrM[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println();
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arrN = arrayFunction();
            int[] arrM = arrayFunction();
            intersectionArray(arrN,arrM);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
