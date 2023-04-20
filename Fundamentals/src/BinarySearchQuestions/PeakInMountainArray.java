package BinarySearchQuestions;

import java.util.Scanner;

public class PeakInMountainArray {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.next().trim().charAt(0);
        }
        return input;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int startIndex = 0, endIndex = arr.length-1;
        while (startIndex < endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (arr[mid] > arr[mid + 1]) {
            /*we are in decreasing section, so we have to include mid-element
            move towards left
            // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
             */
                endIndex = mid;
            } else {
            /*we are in increasing section, and we know for sure mid is not peak element, and we can exclude
            move towards right
             */
                startIndex = mid + 1;
            }
        }
        return startIndex;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = takeInput();
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}
