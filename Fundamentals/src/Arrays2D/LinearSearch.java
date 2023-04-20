package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int[][] takeInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of Rows:");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns");
        int columns = in.nextInt();
        int[][] input = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element at " + i + " th row and" + j + " th columns:");
                input[i][j] = in.nextInt();
            }
        }
        //initialising Jagged arrays
//        for (int i = 0; i < arr.length; i++ ){
//            arr[i] =  new int[i];
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0;j<arr[rows].length;j++){
//                arr[rows][] = in.nextInt();
//            }


        return input;
    }

    public static int[] search(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int columns = 0; columns < arr[rows].length; columns++) {
                if (arr[rows][columns] == target) {
                    return new int[]{rows, columns};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int max(int[][] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int[] insideArr : arr) {
            for (int ans : insideArr) {
                if (ans > maxValue) {
                    maxValue = ans;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = takeInput();
        int target = in.nextInt();
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
}
