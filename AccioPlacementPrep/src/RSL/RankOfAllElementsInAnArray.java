package RSL;

import java.util.Arrays;
import java.util.Scanner;

public class RankOfAllElementsInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] A = {1, 2, 5, 2, 1, 25, 2};
        double[] ans = rankFind(arr);
        for (double val : ans) {
            System.out.print(val + " ");
        }
    }

    public static double[] rankFind(int[] a) {
        int n = a.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = a[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (x, y) -> x[0] - y[0]);
        double[] ans = new double[n];
        int rank = 1;
        for (int i = 0; i < n; ) {
            int j = i;
            int count = 1, sum = rank;
            while (j < n - 1 && arr[j][0] == arr[j + 1][0]) {
                count++;
                rank++;
                sum += rank;
                j++;
            }
            double avg = (double) sum / count;


            for (int k = i; k < (i + count); k++) {
                ans[arr[k][1]] = avg;
            }

            rank++; //for next iteration
            i += count;
        }
        return ans;
    }
}
