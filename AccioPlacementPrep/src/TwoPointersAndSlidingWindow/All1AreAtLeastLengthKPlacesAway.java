package TwoPointersAndSlidingWindow;

class All1AreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            while (i < n && nums[i] == 0) {
                i++;
            }

            int j = i + 1; ///find next 1
            while (j < n && nums[j] == 0) {
                j++;
            }
            if (j < n && (j - i - 1) < k) return false;
            i = j;
        }
        return true;
    }
}