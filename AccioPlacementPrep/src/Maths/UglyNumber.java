package Maths;

public class UglyNumber {
    public boolean isUgly(int n) {
        if (n < 1) return false;

        while (n != 1) {

            if (n % 2 == 0) n = n / 2;
            else if (n % 3 == 0) n = n / 3;
            else if (n % 5 == 0) n = n / 5;
            else break;

        }

        return (n == 1);
    }

    public boolean isUglyRecursive(int n) {
        if (n < 1) return false;

        if (n == 1) return true;

        if (n % 2 == 0) return isUglyRecursive(n / 2);

        if (n % 3 == 0) return isUglyRecursive(n / 3);

        if (n % 5 == 0) return isUglyRecursive(n / 5);


        return false;
    }
}
