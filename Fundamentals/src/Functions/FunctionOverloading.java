package Functions;

public class FunctionOverloading {
    public static int sum(int a, int b){
        return a + b;
    }
//    public static double sum(int a, int b){         Name Conflict
//        double result = a + b;
//        return result;
//    }
    public static double sum(double a,double b){
        return a + b;
    }
    public static int sum(int a){
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a=10,b=19;
        System.out.println(sum(a));
        System.out.println(sum(a,b));
        System.out.println(sum(10.5,17.8));
    }
}
