package Assignment;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(findPairs(arr, k));

    }

    private static int findPairs(int[] arr, int k) {
        int numPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % k == 0) {
                    numPairs++;
                }
            }
        }
        return numPairs;
    }
}
