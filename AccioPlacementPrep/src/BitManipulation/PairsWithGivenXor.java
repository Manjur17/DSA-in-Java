package BitManipulation;

import java.util.HashSet;

public class PairsWithGivenXor {
    public int solve(int[] arr, int B) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int val : arr) {
            if (set.contains(B ^ val)) {
                count++;
                //if a ^ b = B -> then b can only XOR with a to give B and no other element
                //to handle duplicates
                set.remove(B ^ val);
            }
            set.add(val);
        }
        return count;
    }
}
