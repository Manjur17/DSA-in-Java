package SeachingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {

            // if newInterval before slot insert newInterval & update slot as new interval -> [[1,2]] [4,6]
            if (interval[1] < newInterval[0]) {
                list.add(interval);
            }

            // if slot is lesser than new Interval insert slot -> [[4,6]] [1,2] OR [[1,2]] [0,0]
            else if (newInterval[1] < interval[0]) {
                list.add(newInterval);
                newInterval = interval;
            }

            // if above conditions fail it's an overlap since possibility of new interval existing in left & right of slot is checked
            // update lowest of start & highest of end & not insert
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // insert the last newInterval
        list.add(newInterval);

        // convert to int[][] array
        return list.toArray(new int[0][]);
    }
}
