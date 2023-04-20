package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr, n));
    }

    static int majorityElement(int[] a, int size) {
        Arrays.sort(a);
        int count = 1;
        if (size == 1) {
            return a[0];
        }
        for (int i = 0; i < size - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
                if (count > size / 2) {
                    return a[i];
                }
            } else {
                count = 1;
            }
        }
        return -1;
    }
}
