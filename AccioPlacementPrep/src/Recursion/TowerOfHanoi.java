package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(toh(3, 1, 2, 3));
    }

    public static long toh(int N, int from, int to, int aux) {
        // Your code here
        long moves = 1;
        if (N == 1) {
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            return 1;
        }

        moves += toh(N - 1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        moves += toh(N - 1, aux, to, from);

        return moves;
    }
}
