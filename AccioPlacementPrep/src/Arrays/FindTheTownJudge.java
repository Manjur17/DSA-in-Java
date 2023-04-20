package Arrays;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trusts) {
        if(n == 1) return 1;
        int[] count = new int[n];
        int judge = -1;
        for (int[] trust : trusts) {
            count[trust[0] - 1] = -1; //1 based indexing
            count[trust[1] - 1]++; //trusted by this many persons

            if (count[trust[1] - 1] == n - 1) {
                judge = trust[1];
            }
        }

        if (judge != -1 && count[judge - 1] == n - 1) {
            return judge;
        }
        return -1;
    }
}
