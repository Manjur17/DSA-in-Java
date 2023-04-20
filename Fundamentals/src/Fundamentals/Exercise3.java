package Fundamentals;
public class Exercise3 {
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {
            a = 100;
        }
        System.out.println(a);

        int i = 10;
        while (i > 0) {
            if (i % 2 == 0) {
                System.out.print(10 - i);
            }
            i--;
        }
        System.out.print("\n");

        i = 2;
        while (i < 10) {
            System.out.print(i);
            i = i + 2;
        }
        System.out.print("\n");

        i = 1;
        while (i < 5) {
            System.out.print( 2 * i);
            i = i + 1;
        }
        System.out.print("\n");

        i = 2;
        while (i < 10) {
            System.out.print(i);
            i *= 2;
        }
        System.out.print("\n");

        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i);
            i++;
        }
    }

}
