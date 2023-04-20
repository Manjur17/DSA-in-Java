package BitManipulation;

public class DecimalToBinary {
    void toBinaryI(int N) {
        System.out.print(Integer.toBinaryString(N));
    }

    void toBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            sb.insert(0, rem);
            n /= 2;
        }
        System.out.println(sb);
    }
}
