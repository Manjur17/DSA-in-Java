package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;


public class PriyankaAndToysHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        while (i < n) {
            int min = arr[i];
            int j = i + 1;
            while (j < n && arr[j] <= min + 4) {
                j++;
            }
            count++;
            i = j;
        }
        return count;
    }

}
