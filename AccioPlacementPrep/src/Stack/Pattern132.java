package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(find132pattern(arr1));
    }

    public static boolean find132pattern(int[] nums) {
        //Here , if you want to find the number on right which is greater than number on left ,
        // our best bet is to take max of all elements on right which are smaller than current element,
        // and for left side , we can take element which is smallest
        Stack<Integer> st = new Stack<>();
        int secondMaximum = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            //trying to keep maximum at top of stack
            //so that when next max is encountered we can directly do secondMax  = st.peek();
            while (!st.isEmpty() && nums[i] > st.peek()) {
                secondMaximum = st.pop();
            }
            //now if the current element is smaller than secondMaximum
            if (nums[i] < secondMaximum)
                return true;

            st.push(nums[i]);
        }

        return false;
    }

    public boolean find132patternII(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] min = new int[arr.length];
        min[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min[i] = Math.min(min[i - 1], arr[i]);
        }

        for (int j = arr.length - 1; j >= 0; j--) {

            while (!st.isEmpty() && st.peek() <= min[j]) {
                st.pop();
            }

            if (!st.isEmpty() && st.peek() < arr[j]) {
                return true;
            }

            st.push(arr[j]);
        }

        return false;
    }

    public boolean find132patternBrute(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                for (int j = arr.length - 1; j > i; j--) {
                    if (min < arr[j] && arr[i] > arr[j])
                        return true;
                }
            }

        }

        return false;
    }
}
