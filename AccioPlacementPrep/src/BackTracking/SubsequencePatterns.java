package BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequencePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 1};
        printSum(arr, 0, new ArrayList<>(), 2, 0);
        System.out.println();
        System.out.println(printOneSum(arr, 0, new ArrayList<>(), 2, 0));
        System.out.println(count(arr, 0, new ArrayList<>(), 2, 0));

    }

    public static void printSum(int[] arr, int index, ArrayList<Integer> list, int sum, int s) {
        if (index == arr.length) {
            if (sum == s)
                System.out.print(list + " ");

            return;
        }
        list.add(arr[index]);
        s += arr[index];
        printSum(arr, index + 1, list, sum, s);
        list.remove(list.size() - 1);
        s -= arr[index];
        printSum(arr, index + 1, list, sum, s);
    }

    public static boolean printOneSum(int[] arr, int index, ArrayList<Integer> list, int sum, int s) {
        if (index == arr.length) {
            if (sum == s) {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        s += arr[index];
        if (printOneSum(arr, index + 1, list, sum, s)) {
            return true;
        }
        list.remove(list.size() - 1);
        s -= arr[index];
        return printOneSum(arr, index + 1, list, sum, s);
    }

    public static int count(int[] arr, int index, ArrayList<Integer> list, int sum, int s) {
        if (index == arr.length) {
            if (sum == s)
                return 1;

            return 0;
        }
        list.add(arr[index]);
        s += arr[index];
        int left = count(arr, index + 1, list, sum, s);
        list.remove(list.size() - 1);
        s -= arr[index];
        int right = count(arr, index + 1, list, sum, s);
        return left + right;
    }
}
