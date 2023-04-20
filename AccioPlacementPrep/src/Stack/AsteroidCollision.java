package Stack;

import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = asteroidCollision(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public int[] remainingStudents(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int val : arr) {
            boolean isDestroyed = false;

            if (st.isEmpty() || val > 0) {
                st.push(val);
            } else {

                //3 cases
                while (!st.isEmpty()) {

                    if (st.peek() < 0) { //this ensures st.peek() is always > 0 to process collision
                        st.push(val);
                        break;
                    }

                    if (Math.abs(val) > st.peek()) {
                        st.pop();
                        if (st.isEmpty()) {
                            //don't add the val here directly else while (!st.isEmpty()) will not end
                            isDestroyed = true; //incoming asteroid dominated, so we have to put into stack
                        }
                    } else if (Math.abs(val) < st.peek()) {
                        break;
                    } else if (Math.abs(val) == st.peek()) {
                        st.pop();
                        break;
                    }
                }

                if (isDestroyed) {
                    st.push(val);
                }
            }
        }

        int k = st.size() - 1;
        int[] ans = new int[st.size()];
        while (!st.empty()) {
            ans[k--] = st.pop();
        }

        return ans;
    }

    public static int[] asteroidCollisionBetter(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int num : arr) {
            while (!st.isEmpty() && st.peek() > 0 && st.peek() < -(num)) {
                st.pop();
            }
            if (st.isEmpty() || num > 0 || st.peek() < 0) { //st.peek() < 0 when [-1,-2,1,2]
                st.push(num);
            } else if (st.peek() == Math.abs(num)) {
                st.pop();
            }
        }
        int k = st.size() - 1;
        int[] ans = new int[st.size()];
        while (!st.empty()) {
            ans[k--] = st.pop();
        }
        return ans;
    }

    public static int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int num : arr) {
            boolean isDestroyed = false;
            if (st.isEmpty() || num > 0) {
                st.push(num);
            } else {
                //we wii encounter opposite asteroid and destroy individually
                while (!st.empty() && st.peek() > 0) {
                    if (st.peek() > Math.abs(num)) {
                        isDestroyed = true;
                        break;
                    } else if (st.peek() == Math.abs(num)) {
                        isDestroyed = true;
                        st.pop();
                        break;
                    } else {
                        st.pop(); //st.peek() < Math.abs(arr[i])
                    }
                }

                if (!isDestroyed)
                    st.push(num); //incoming asteroid dominated, so we have to put into stack if is not destroyed
            }

        }

        int k = st.size() - 1;
        int[] ans = new int[st.size()];
        while (!st.empty()) {
            ans[k--] = st.pop();
        }

        return ans;
    }
}
