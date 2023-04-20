package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
