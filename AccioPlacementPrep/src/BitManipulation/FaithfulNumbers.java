package BitManipulation;

public class FaithfulNumbers {
    public static void main(String[] args) {
        System.out.println((2457 & 1));
    }

    static Long nthFaithfulNum(int n) {
        long ans = 0;
        int i = 0;
        while (n > 0) {
            long last = n & 1;
            ans += last * Math.pow(7, i);
            i++;
            n = n >> 1;
        }

        return ans;
    }
}
