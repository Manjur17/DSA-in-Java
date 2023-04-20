package BitManipulation;

public class LongestConsecutive1 {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(384));
    }

    public static int maxConsecutiveOnes(int n) {
        int count = 0, max = 0;
        while (n != 0) {
            if (((n & 1) == 1)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }

            n = n >> 1;
        }
        max = Math.max(max, count);
        return max;
    }
}
