package SeachingAndSorting;

import java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][2];
        //Taking input from user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(merge(arr)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        int start = intervals[0][0], end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] > end) {
                list.add(new int[]{start, end});
                start = intervals[i][0];
            }

            end = Math.max(intervals[i][1], end);


        }

        list.add(new int[]{start, end});

        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            int[] arr = list.get(i);
            ans[i][0] = arr[0];
            ans[i][1] = arr[1];
        }

        return ans;

        /*  int[][] ans =  list.toArray(new int[0][]);
            this returns [][] of size list or default size new int[0][]
            int[][] ans1 =  list.toArray(new int[list.size()][2]);
         */
    }
}
