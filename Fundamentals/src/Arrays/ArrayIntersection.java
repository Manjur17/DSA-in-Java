package Arrays;

import java.util.Scanner;

public class ArrayIntersection {
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
    public static void intersectionArray(int[] arrN, int[] arrM) {
        System.out.println("The Intersection elements in a row:");
        for (int i = 0; i < arrN.length; i++) {
            for (int j = 0; j < arrM.length; j++) {
                    if (arrN[i] == arrM[j]) {
                        System.out.println(arrN[i] + " ");
                        arrM[j]=Integer.MIN_VALUE;
                        break;
                    }
            }
        }
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
