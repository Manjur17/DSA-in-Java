package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PushZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        push(arr);
    }

    private static void push(int[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                ind++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
