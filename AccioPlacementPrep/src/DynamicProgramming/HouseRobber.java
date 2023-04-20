package DynamicProgramming;

public class HouseRobber {
    static long solve(int[] arr) {
        int n = arr.length;
        long prev = arr[0];
        long prev2 = 0;

        for (int i = 1; i < n; i++) {
            long pick = arr[i];
            if (i > 1)
                pick += prev2;
            long nonPick = 0 + prev;

            long cur_i = Math.max(pick, nonPick);
            prev2 = prev;
            prev = cur_i;

        }
        return prev;
    }

    public static long houseRobber(int[] valueInHouse) {
        int n = valueInHouse.length;
        if (n == 1) return valueInHouse[0];
        int[] temp1 = new int[n];
        int[] temp2 = new int[n];

        for (int i = 0; i < n; i++) {
            if (i != 0) temp1[i] = valueInHouse[i];
            if (i != n - 1) temp2[i] = valueInHouse[i];
        }
        long ans1 = solve(temp1);
        long ans2 = solve(temp2);
        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
//        int[] valueInHouse = {1,3,2,1};
        int[] valueInHouse = {2,3,2};
        System.out.println(houseRobber(valueInHouse));
    }
}
