package Arrays;

public class StrictlyIncreasingArray {
    //Minimum Operations to Make the Array Increasing
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] <= nums[i-1]){
                ans += nums[i-1] - nums[i] + 1; //operations
                nums[i] = nums[i-1] +1; //strictly increasing
            }
        }
        return ans;
    }
}
