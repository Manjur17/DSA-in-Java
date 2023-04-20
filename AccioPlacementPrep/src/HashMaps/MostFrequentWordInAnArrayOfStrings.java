package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentWordInAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(mostFrequentWord(arr, n));
    }

    public static String mostFrequentWord(String[] arr, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) >= maxFreq) {
                ans = arr[i];
                maxFreq = map.get(arr[i]);
                map.remove(arr[i]);
                //map.put(arr[i], 0);
            }
        }
        return ans;
    }
}
