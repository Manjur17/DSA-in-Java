package SeachingAndSorting;

import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestNumber(arr));
    }

    private String printLargest(int[] nums) {
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If, after being sorted, the largest number is `0`, the entire number is zero.
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();
        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }

    public static String largestNumber(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num + "");
        }

        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));

        // If, after being sorted, the largest number is `0`, the entire number is zero.
        if (list.get(0).equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        StringBuilder ans = new StringBuilder();
        for (String str : list) {
            ans.append(str);
        }

        return ans.toString();
    }

    private static class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return (b + a).compareTo(a + b);
        }
    }

    public String largestNumberI(int[] nums) {
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort strings according to custom comparator.
        Arrays.sort(arr, new LargerNumberComparator());

        // If, after being sorted, the largest number is `0`, the entire number is zero.
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        StringBuilder ans = new StringBuilder();
        for (String str : arr) {
            ans.append(str);
        }

        return ans.toString();
    }
}
