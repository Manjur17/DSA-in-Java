package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<List<Integer>> ans = threeSum(arr);
        for (List<Integer> list : ans) {
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean find3Numbers(int[] arr, int n, int X) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int target = X - arr[i];
            int left = i + 1, right = n - 1;
            while (left < right) {
                if (arr[left] + arr[right] == target) {
                    return true;
                } else if (arr[left] + arr[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return false;
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int target = -arr[i];
            int left = i + 1, right = n - 1;

            while (left < right) {//Two sum problem
                int sum = arr[left] + arr[right];
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    //a[i],a[left],a[right]
                    List<Integer> subList = new ArrayList<>();
                    subList.add(arr[i]);  //l.add(-target);
                    subList.add(arr[left]);
                    subList.add(arr[right]);
                    list.add(subList);//Adding sublist into list of lists
                    while (left < right && arr[left] == arr[left + 1])
                        left++;
                    left++;

                    while (left < right && arr[right] == arr[right - 1])
                        right--;
                    right--;
                }
            }

            while (i < n - 2 && arr[i] == arr[i + 1])
                i++;
        }
        return list;
    }
}
