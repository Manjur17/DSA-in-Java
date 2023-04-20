package OperatorsAndForLoop;

public class BreakAndContinue {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5;i++){
            if (i ==4){
                break;
//                System.out.println(i);
            }
            System.out.println(i);
        }
        int j = 1;
        while (j <= n){
            j++;
            if (j == 4){
                continue;
            }
            System.out.print(j + " ");
        }
    }
}
