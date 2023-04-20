package RSL;

public class ConvertStringToInteger {
    //Convert String To Integer Without Using Any Inbuilt Functions
    public static void convert(String s) {
        int num = 0;
        int n = s.length(); //length of number

        for (int i = 0; i < n; i++) {
            num = num * 10 + (s.charAt(i) - '0');
        }

        System.out.print(num);
    }

    public static void main(String[] args) {
        // Given string of number
        String s = "985632";
        convert(s);
    }
}
