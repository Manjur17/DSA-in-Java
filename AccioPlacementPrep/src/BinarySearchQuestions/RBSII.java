package BinarySearchQuestions;

import java.util.Scanner;

public class RBSII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(isPresentRecursionTechnique(arr, target));
    }

    public static boolean isPresentRecursionTechnique(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            // skip the duplicates element

            while (low < high && arr[low] == arr[low + 1]) {
                low++;
            }

            // skip the duplicates elements

            while (low < high && arr[high] == arr[high - 1]) {
                high--;
            }

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return true;
            }
            /*
                if ((arr[low] == arr[mid]) && (arr[high] == arr[mid])) {
                low++;
                high--;
                }
            */
            else if (arr[low] <= arr[mid]) {
                // left part is sorted
                if (target >= arr[low] && target <= arr[mid])   // if element is present is sorted part
                {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] <= arr[high]) {
                // right part is sorted
                if (target >= arr[mid] && target <= arr[high])  // if element is present in sorted part
                {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }


}
