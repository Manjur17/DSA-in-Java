package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int val : map.keySet()) {
            int key = map.get(val);
            map.put(val, 0);
            //map.remove(val); -> Concurrent Modification Exception
            if (map.containsValue(key)) return false;
        }

        return true;
    }
}
