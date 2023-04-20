package SeachingAndSorting;

import java.util.*;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seats = new int[n];
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        System.out.println(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        int n = seats.length;

        for (int i = 0; i < n; i++) {
            moves += Math.abs(students[i] - seats[i]);
        }

        return moves;
    }
}
