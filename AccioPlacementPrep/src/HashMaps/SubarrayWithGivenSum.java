package HashMaps;

import java.util.*;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(subarraySum(arr, n, k));
    }

    public int subarraySumI(int[] arr, int k) {
        int n = arr.length, count = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum == k)
                count++;
            //Now, check if (sum-k) is present in the HashMap
            // if it is present it just means that a sub array exists which has a sum equal to k.
            //if (sum-k) doesn't exist just insert the sum to the HashMap
            // as the sum is the sum of the array up to that index.
            if (map.containsKey(currSum - k))
                count += map.get(currSum - k);

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }

    public void subarraySum(int[] arr, int k) {
        int currSum = 0, start = 0, end = -1, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == k) {
                start = 0;
                end = i;
                break;
            }
            //if hashMap already has the value, means we already have sub array with the sum - so stop
            if (map.containsKey(currSum - k)) {
                start = map.get(currSum - k) + 1;
                end = i;
                break;
            }

            map.put(currSum, i);

        }

        if (end == -1) {
            System.out.println("No subarray with given sum exists");
        } else {
            System.out.println("Sum found between indexes " + start + " to " + end);
        }

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int B) {
        int start = 0, end = 0, sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        //for non-negative numbers
        while (end < n) {
            sum += arr[end];

            if (sum == B) {
                list.add(start + 1);
                list.add(end + 1);
                break;
            }

            while (sum > B) {
                sum -= arr[start];
                start++;
            }
            end++;
        }

        return list;
    }
}
