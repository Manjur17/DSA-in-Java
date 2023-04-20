package SeachingAndSorting;

import java.util.*;

public class MaxUnitsTruck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int truckSize = s.nextInt();
        System.out.println(maximumUnits(arr, truckSize));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);    //sort in decreasing order based on numberOfUnits

        int total = 0;

        for (int[] boxType : boxTypes) {
            if (boxType[0] <= truckSize) {  //if no. of boxes is less than or equal to truckSize
                total += (boxType[0] * boxType[1]);  //take all the boxes and added the units
                truckSize -= boxType[0];  //decrement the truckSize by numberOfBoxes
            } else if (truckSize > 0) {
                total += (truckSize * boxType[1]);  //if anything is left take the boxes equal to remaining size and add the units
                break;              //just break nothing more to add as we have reach full capacity
            }
        }
        return total;
    }
}
