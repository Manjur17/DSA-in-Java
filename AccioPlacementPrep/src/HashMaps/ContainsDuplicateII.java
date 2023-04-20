package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    public static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (i - map.get(arr[i]) <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }

        return false;
    }

    boolean containsNearbyDuplicateBrute(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j] && Math.abs(i - j) <= k)
                    return true;
            }
        }
        return false;
    }
}
