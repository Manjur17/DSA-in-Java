package SearchingAndSorting;

import java.util.Scanner;

public class PushZeroToEnd {
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
    public static void pushZeroToEnd(int[] nums) {
        int size = nums.length;
        int nextZero = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0){
                int temp= nums[nextZero];
                nums[nextZero] = nums[i];
                nums[i] = temp;
                nextZero++;
            }
        }
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void resultArr(int t){
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            pushZeroToEnd(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
