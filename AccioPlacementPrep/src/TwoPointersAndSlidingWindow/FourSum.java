package TwoPointersAndSlidingWindow;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        List<List<Integer>> ans = fourSum(arr, target);
        for (List<Integer> list : ans) {
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {

            long target_3 = target - arr[i]; // 3 sum

            for (int j = i + 1; j < n - 2; j++) {

                long target_2 = target_3 - arr[j]; // 2 sum

                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = arr[left] + arr[right];
                    if (sum < target_2) {
                        left++;
                    } else if (sum > target_2) {
                        right--;
                    } else {
                        //a[i],,a[j],a[start],a[end]
                        List<Integer> subList = new ArrayList<>();
                        subList.add(arr[i]);
                        subList.add(arr[j]);
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

                // Processing the duplicates of 3 sum
                while (j < n - 2 && arr[j] == arr[j + 1])
                    j++;
            }

            // Processing the duplicates of 4 sum
            while (i < n - 3 && arr[i] == arr[i + 1])
                i++;

        }

        return list;
    }
}
