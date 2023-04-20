package Functions;
// Examples of function of type void(no return type) with and without arguments
public class MoreOnFunctions {
    //Function with no arguments and no return type
    public static void printEvenNumbers(){
        for (int i=2; i<=100; i+=2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //Function with arguments and no return type
    public static void printNumbers(int start,int end){
        if(start%2 != 0){
            start++;
        }
        for (int i= start; i <= end; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //Function with arguments and return type
    public static int divideNumbers(int a,int b){
        if(b == 0){
            System.out.println("Divion by 0 is not possible");
            return 1;
        }
        return a/b;
    }
    //Function with no arguments and no return type
    public static void divideTwoNumbers(){
        int a=24,b=4;
        if(b == 0){
            System.out.println("Divion by 0 is not possible");
            return ;
        }
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        printEvenNumbers();
        printNumbers(3,17);
        System.out.println(divideNumbers(10,5));
//        System.out.println(divideTwoNumbers(8,5)); as function is not returning any type we cannot print the result
        divideTwoNumbers();
    }
}
