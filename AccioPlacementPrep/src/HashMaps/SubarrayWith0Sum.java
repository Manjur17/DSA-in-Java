package HashMaps;

import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWith0Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSum(arr, n));
    }

    static boolean findSum(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum == 0 || set.contains(currSum)) {
                return true;
            }
            set.add(currSum);
        }
        return false;
    }
}
