package SeachingAndSorting;

import java.util.*;

public class PairDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findPair(arr, n, k));
    }

    public static boolean findPair(int[] arr, int size, int n) {
        Arrays.sort(arr);
        int i = 0, j = 1;
        while (i < size && j < size) {
            if (arr[j] - arr[i] == n) {
                return true;
            } else if (arr[j] - arr[i] < n) {
                j++;
            } else {
                i++;
            }
            if (i == j) {
                j++;
            }
        }
        return false;
    }
}
