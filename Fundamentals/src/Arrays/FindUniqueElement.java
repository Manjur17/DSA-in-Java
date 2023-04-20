package Arrays;

import java.util.Scanner;

public class FindUniqueElement {
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
    public static void uniqueElements(int[] arr){
        int size=arr.length;
        for (int i=0; i < size; i++){
            int j;
            boolean isUnique = true;
            for (j=0 ; j < size ; j++){
                if (i != j) {
                    if(arr[i] == arr[j]){
                        isUnique = false;
                        break;
                    }
                }
            }
            if (isUnique){
                System.out.println("The unique element is: " + arr[i]);
            }

//            if (j == arr.length){
//                return arr[i];
//            }
        }
    }
    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
             uniqueElements(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
