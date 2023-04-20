package RSL;

public class LargestNumberWithGivenSum {
    static String largestNumber(int n, int sum) {
        if (n * 9 < sum) {
            return "-1";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int t;
            if (sum > 9) {
                sum -= 9;
                t = 9;
            } else if (sum == 0) {
                t = 0;
            } else {
                t = sum;
                sum -= t;
            }

            sb.append(t);
        }

        return sb.toString();
    }
}
