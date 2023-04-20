package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = productExceptSelfEfficient(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelfEfficient(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, 1);

        //Prefix & Suffix Products in 1 pass
        int prefix = 1, suffix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] *= prefix;
            prefix *= nums[i];

            answer[n - i - 1] *= suffix;
            suffix *= nums[n - i - 1];
        }

        return answer;
    }

    public int[] productExceptSelfI(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        int prod = 1;
        for (int i = 1; i < n; i++) {
            prod *= nums[i - 1];
            ans[i] = prod;
        }

        prod = 1;
        for (int i = n - 2; i >= 0; i--) {
            prod *= nums[i + 1];
            ans[i] *= prod;
        }

        return ans;
    }

    public static int[] productExceptSelfBetter(int[] nums) {
        //Space Optimized Prefix & Suffix Products
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];

        // prefix product
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i];
        }

        int prod = 1;
        for (int i = n - 1; i > 0; i--) {
            ans[i] = ans[i - 1] * prod;
            prod = prod * nums[i];
        }

        ans[0] = prod;
        return ans;

    }

    public static int[] productExceptSelfBrute(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    answer[k] *= nums[j];
                }
            }
            k++;
        }
        return answer;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        int count = 0, k = 0;
        int prod = 1;
        for (int num : nums) {
            if (num == 0) {
                count++;
            } else {
                prod *= num;
            }
        }
        for (int num : nums) {
            if (num != 0) {
                if (count > 0) {
                    answer[k++] = 0;
                } else {
                    answer[k++] = prod / num;
                }
            } else {
                if (count > 1) {
                    answer[k++] = 0;
                } else {
                    answer[k++] = prod;
                }
            }
        }
        return answer;
    }
}
