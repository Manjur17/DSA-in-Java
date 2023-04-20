package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subarraysDivByK(arr, k));
    }

    public static int subarraysDivByK(int[] arr, int k) {
        int n = arr.length, count = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //<Reminder,Frequency>

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            int rem = currSum % k;
            if (rem < 0)
                rem += k;

            if (rem == 0)
                count++;
            if (map.containsKey(rem))
                count += map.get(rem);

            map.put(rem, map.getOrDefault(rem, 0) + 1);

        }

        return count;
    }
}
