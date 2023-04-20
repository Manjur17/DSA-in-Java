package BitManipulation;

public class SingleNumberIII {
    public int[] singleNumber(int[] arr) {
        int res1 = 0, res2 = 0, xor = 0;

        for (int val : arr) {
            //XOR toggles the bits and will form a number that will have
            //set bits at the places where the numbers bits differ in m and n
            //eg: 010 ^ 111 = 101...diff of bits = count of 1's = 2
            xor = xor ^ val;
        }

        // Find a set bit in the XOR (We find right most set bit here)
        //this implies the position where the bits differ in XOR
        //basically XOR is formed by XOR of res1 and res2 only.
        int rsb = (xor & -xor);

        // Traverse through all numbers and divide them in two groups
        // (i) Having set bit set at same position as the rsb in xor
        // (ii) Having 0 bit at same position as the rsb in xor

        for (int val : arr) {
            if ((val & rsb) != 0)
                res1 = res1 ^ val;
            else
                res2 = res2 ^ val;
        }

        int[] ans = new int[2];
        ans[0] = res1;
        ans[1] = res2;
        return ans;
    }
}
