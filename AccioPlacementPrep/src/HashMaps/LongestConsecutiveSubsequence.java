package HashMaps;

import java.util.*;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); //add all unique elements to set
        }

        int maxLen = 0;

        for (int val : set) {
            //if num-1 is not present in set then our subsequence will start from num
            if (!set.contains(val - 1)) {
                int currNum = val;
                int currLen = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }

                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }

    public int longestConsecutiveBrute(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        Arrays.sort(arr);
        int maxLen = 1; //Min 1 length subsequence
        int currLen = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) continue; //ignore the duplicates

            if (arr[i] == arr[i - 1] + 1) {
                currLen++;
            } else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1; // check for other subsequence
            }
        }
        maxLen = Math.max(maxLen, currLen); //to handle [1,2,3,4,5]
        return maxLen;
    }
}
