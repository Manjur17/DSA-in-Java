package BinarySearchQuestions;

import java.util.Scanner;

public class MinimumSpeedToArriveOnTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double hour = sc.nextDouble();
        System.out.println(minSpeedOnTime(arr, hour));

    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int low = 1, high = Integer.MAX_VALUE;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(dist,mid,hour)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int speed,double hour) {
        int n = arr.length;
        double  sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.ceil((double) arr[i] / speed);

        }
        double temp = (double) arr[n-1]/ (double) speed;
        sum += temp;
        return sum <= hour;
    }

}
