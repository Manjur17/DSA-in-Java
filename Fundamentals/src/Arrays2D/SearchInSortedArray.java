package Arrays2D;

import java.util.Scanner;

public class SearchInSortedArray {
    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns");
        int columns = s.nextInt();
        int[][] input = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void searchInSortedArray(int[][] arr, int target) {
        int i = 0, j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                System.out.println("[" + i + "," + j + "]");
                return;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(target + " is Not found");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = takeInput();
        int target = in.nextInt();
        searchInSortedArray(arr, target);
    }
}
