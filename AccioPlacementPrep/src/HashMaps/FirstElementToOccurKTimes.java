package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class FirstElementToOccurKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstElementKTime(arr, n, k));
    }

    public static int firstElementKTime(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }
}
