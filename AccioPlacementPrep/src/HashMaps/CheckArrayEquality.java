package HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckArrayEquality {
    public static boolean check(long[] a, long[] b, int N) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (long j : a) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (long val : b) {
            if(!map.containsKey(val)){
                return false;
            }

            int freq = map.get(val);
            if (freq > 0){
                map.put(val, --freq);
            }else
                return false;
        }
        return true;
    }

    public static void Brute() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
