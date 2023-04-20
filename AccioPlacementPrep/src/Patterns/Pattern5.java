package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
        System.out.println();
        pattern5(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            // for every row, run the col
            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int col = 1; col <= (n - (row % n)); col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalColsInRow = row <= n ? row : (2 * n - row);
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
