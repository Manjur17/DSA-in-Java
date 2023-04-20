package Arrays;

import java.util.Scanner;

public class NoOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }

        int ans = 0;
        for (int i = 0; i < 101; i++) {
            if (freq[i] > 1) {
                int n = freq[i];
                ans += (n * (n - 1)) / 2; //nC2
            }
        }
        return ans;
    }
}
