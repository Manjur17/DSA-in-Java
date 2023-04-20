package LinkedList;

public class HappyNumber {
    static int nextHappy(int N) {
        // next happy number
        for (int i = N + 1; ; i++) {
            if (isHappy(i))
                return i;
        }
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
}
