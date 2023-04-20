package Strings;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] intVal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rVal = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 13; ) {
            if (num / intVal[i] != 0) {
                ans.append(rVal[i]);
                num -= intVal[i];
            } else {
                i++;
            }
        }

        return ans.toString();
    }

    public String intToRomanII(int num) {
        int[] intVal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rVal = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 13; i++) {
            //ans.append(rVal[i].repeat(num / intVal[i])); directly also possible
            if (num / intVal[i] != 0) {
                int n = num / intVal[i];
                ans.append(rVal[i].repeat(n));
            }
            num %= intVal[i];
        }

        return ans.toString();
    }
}
