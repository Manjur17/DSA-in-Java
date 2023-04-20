package BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int D = sc.nextInt();
        ArrayList<Integer> list = rotate(n, D);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    static ArrayList<Integer> rotate(int N, int D) {
//        int TOTAL_BITS = 16;
        if (D > 16) {
            D = D % 16;
        }
        // left shift
        int left = ((N << D) | N >> (16 - D)) & 0xFFFF;
        //right shift
        int right = ((N >> D) | N << (16 - D)) & 0xFFFF;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(left);
        ans.add(right);
        return ans;
    }
}
