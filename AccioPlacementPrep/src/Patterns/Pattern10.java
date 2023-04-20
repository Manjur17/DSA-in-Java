package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalColsInRow = row <= n ? row : (2 * n - row);

            int noOfSpaces = n - totalColsInRow;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print("  ");
            }

            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
