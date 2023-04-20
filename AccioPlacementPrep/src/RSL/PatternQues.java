package RSL;

public class PatternQues {
    public static void main(String[] args) {
        pattern(7);
    }

    static void pattern(int n) {
        String s = "*";
        for (int i = 1; i <= n; i++) {
            System.out.println(s);
            s += " *";
        }
    }
}
