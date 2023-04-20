package Arrays;

import java.util.Scanner;

public class BooksKadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr, t, n));
    }

    private static int findMax(int[] timeForBooks, int t, int n) {
        int countOfBooks = 0;
        int j = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + timeForBooks[i];
            if (sum <= t) {
                countOfBooks++;
            } else {
                sum = sum - timeForBooks[j];
                j++;
            }
        }
        return countOfBooks;
    }
}
