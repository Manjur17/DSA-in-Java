package OOPS.Miscellaneous;

import java.util.ArrayList;
import java.util.function.Consumer;

interface Operation {
    //functional interface
    int operation(int a, int b);
}

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
//        arr.forEach((item) -> System.out.println(item * 2));

//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(x -> System.out.println(x * 2));

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(sum));
        System.out.println(myCalculator.operate(prod));
        System.out.println(myCalculator.operate(sub));
    }

    private int operate(Operation op) {
        return op.operation(5, 3);
    }
}
