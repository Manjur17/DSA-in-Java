package Assignment;

import java.util.Scanner;

public class TwiceOfOthers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        find(arr);
    }

    private static void find(int[] arr) {
        int maxNum = arr[0], idx = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                idx = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (2 * arr[i] > maxNum && i != idx) {
                flag = false;
                System.out.println("-1");
                break;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(idx);
        }

    }
}
