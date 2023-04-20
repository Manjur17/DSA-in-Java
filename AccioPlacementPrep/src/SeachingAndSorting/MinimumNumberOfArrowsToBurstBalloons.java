package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberOfArrowsToBurstBalloons {
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
        System.out.println(findMinArrowShots(arr));
    }

    public static int findMinArrowShots(int[][] points) {
        //Arrays.sort(points, (a, b) -> a[1] - b[1]);  we don't use simple lambda func to sort when value can reach to integer max & min
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])); //use integer compare method
        System.out.println(Arrays.deepToString(points));

        int count = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                // if start of the next balloon > end of the first balloon then increment the arrow
                // Update the new end
                end = points[i][1];
                count++;
            }
        }
        return count;
    }
}
