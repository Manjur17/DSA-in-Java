package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(contains(arr));
    }

    private static boolean contains(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) {
                return false;
            } else {
                set.add(j);
            }
        }
        return true;
    }
}
