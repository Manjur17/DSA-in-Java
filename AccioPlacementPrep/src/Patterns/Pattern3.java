package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
        System.out.println();
        patternApproach2(5);
    }

    static void pattern(int n) {
        for (int row = 5; row >= 1; row--) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void patternApproach2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= (n - row + 1); col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
