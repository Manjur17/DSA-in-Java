package Queues;

import java.util.Scanner;

public class CircularTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(tour(arr1, arr2));
    }

    static int tour(int[] petrol, int[] distance) {
        int n = petrol.length;
        int deficit = 0, balance = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            balance += petrol[end] - distance[end];
            if (balance < 0) {
                start = end + 1;
                deficit += balance;
                balance = 0; //for next petrol pump as we are starting again from there
            }
        }

        if (deficit + balance >= 0) {
            return start;
        }

        return -1;
    }
}
