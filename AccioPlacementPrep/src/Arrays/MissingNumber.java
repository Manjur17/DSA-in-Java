package Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int val : nums) {
            sum += val;
        }
        int n = nums.length;
        int total = (n * (n + 1)) / 2;

        return total - sum;
    }
}
