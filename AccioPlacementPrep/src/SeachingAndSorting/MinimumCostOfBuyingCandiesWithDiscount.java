package SeachingAndSorting;

import java.util.*;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumCost(arr));
        System.out.println(minimumCostEfficient(arr));
    }

    public static int minimumCostEfficient(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int total = 0;
        int count = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (count == 3) {
                count = 1;
                continue;
            }
            total += cost[i];
            count++;
        }
        return total;
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        if (cost.length == 1) {
            return cost[0];
        }
        for (int i = 0, j = cost.length - 1, tmp; i < j; i++, j--) {
            tmp = cost[i];
            cost[i] = cost[j];
            cost[j] = tmp;
        }

        int total = 0;
        for (int i = 0; i < cost.length; i++) {
            if ((i + 1) % 3 == 0) {
                continue;
            }
            total += cost[i];

        }

        return total;
    }
}
