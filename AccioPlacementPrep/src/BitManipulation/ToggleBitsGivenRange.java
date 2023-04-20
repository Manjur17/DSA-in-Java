package BitManipulation;

public class ToggleBitsGivenRange {
    static int toggleBits(int N, int L, int R) {
        int mask = (1 << R - L + 1) - 1;
        mask = (mask << L - 1);

        return (N ^ mask); //toggle happens
    }
}
