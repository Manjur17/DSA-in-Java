package Assignment;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(find(arr, k));
    }

    private static int find(int[] arr, int k) {
        int count = 0;
        for (int j : arr) {
            if (j > 0 && j >= arr[k - 1]) {
                count++;
            }
        }
        return count;
    }
}
