package Stack;

import java.util.Stack;

public class MaxRectangle {
    public int maximalRectangle(char[][] matrix) {
        int[] arr = new int[matrix[0].length];
        int area = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    arr[j] = arr[j] + 1;
                }else{
                    arr[j] = 0;
                }
            }
            area = Math.max(area, largestRectangleArea(arr));
        }
        return area;
    }

    public int maxArea(int[][] arr, int n, int m) {
        int area = largestRectangleArea(arr[0]);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] += arr[i - 1][j];
                }
            }
            area = Math.max(area, largestRectangleArea(arr[i]));
        }
        return area;
    }

    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nsl = NSL(arr);
        int[] nsr = NSR(arr);
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            maxArea = Math.max(maxArea, arr[i] * width);
        }
        return maxArea;
    }

    public static int[] NSR(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            ans[i] = st.empty() ? n : st.peek();

            st.push(i);
        }

        return ans;
    }

    public static int[] NSL(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            ans[i] = st.empty() ? -1 : st.peek();

            st.push(i);
        }

        return ans;
    }
}
