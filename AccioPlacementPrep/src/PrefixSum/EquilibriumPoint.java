package PrefixSum;

import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(equilibriumPoint(arr,n));
    }

    public static int equilibriumPoint(int[] arr, int n) {
        int preSum = 0;
        for (int x : arr){
            preSum += x;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            if (leftSum == preSum - arr[i]){
                return i;
            }
            leftSum += arr[i];
            preSum -= arr[i];
        }
        return -1;
    }
}
