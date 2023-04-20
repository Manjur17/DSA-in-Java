package RSL;

import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortFun(arr);
        sortFun2(arr);
    }

    private static void sortFun(int[] arr) {
        //using 2 pointers
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (arr[i] == 0 && i < j) {
                i++;
            }
            while (arr[j] == 1 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void sortFun2(int[] arr){
        int nextZero= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                nextZero++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
