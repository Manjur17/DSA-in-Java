package HashMaps;

import java.util.HashMap;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] arr, int k) {
        // [2,2,2,1,2,2,1,2,2,2] k = 2
        // [0,1,2,3,4,5,6,7,8,9] -> index
        // when end is at index 6 odd==k. So the number of sub array are 4 (0,6),(1,6),(2,6),(3,6) , count=4
        // no the count come into play when end = 7 the subarray from 0->7 are (0,7),(1,7),(2,7),(3,7) =4
        // when end = 8 the subarray from 0->8 are (0,8),(1,8),(2,8),(3,8) =4,  ... and like this  upto end = 9
        // so total subarrays possible =4+4+4+4=16

        int start = 0, end = 0;
        int oddCount = 0;
        int ans = 0;
        int count = 0;

        while (end < arr.length) {
            if (arr[end] % 2 != 0) {
                oddCount++;
                count = 0; // VVVIMP
            }

            while (oddCount >= k) {
                count++; //count of sub arrays
                if (arr[start] % 2 == 1) {
                    oddCount--;
                }
                start++;
            }

            ans += count;
            end++;
        }

        return ans;
    }

    public int numberOfSubarraysPrefix(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //not needed
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (nums[i] % 2) == 1 ? 1 : 0;
//        }


        int currSum = 0, count = 0;

        for (int num : nums) {
            num = (num % 2 == 1 ) ? 1 : 0;

            currSum += num;

            if (currSum == k) {
                count++;
            }
            if (map.containsKey(currSum - k))
                count += map.get(currSum - k);

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
