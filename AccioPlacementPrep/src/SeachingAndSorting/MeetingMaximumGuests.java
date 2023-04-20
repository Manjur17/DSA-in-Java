package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

class MeetingMaximumGuests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] entry = new int[n];
        int[] exit = new int[n];
        for (int i = 0; i < n; i++) {
            entry[i] = sc.nextInt();
            exit[i] = sc.nextInt();
        }
        int[] arr = findMaxGuests(entry, exit, n);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] findMaxGuests(int[] entry, int[] exit, int n) {
        Arrays.sort(entry);
        Arrays.sort(exit);
        int[] arr = new int[2];
        int i = 1, j = 0;
        int ans = 1; //taking first guest into consideration
        int current = 1;
        int time = entry[0];
        while (i < n && j < n) {
            if (entry[i] <= exit[j]) {
                current++;
                i++;
            } else {
                current--;
                j++;
            }
            if (current > ans) {
                ans = current;
                time = entry[i - 1]; //as i has been incremented inside if
            }

        }

        arr[0] = ans;
        arr[1] = time;
        return arr;
    }
}