package TwoPointersAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortFun(arr);
    }

    private static void sortFun(int[] arr) {
        //Dutch national flag algorithm
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                getSwap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                getSwap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
