package OOPS.Generics;

import static OOPS.Generics.GenFunction.printArray;

public class GenFunction {
    //generic method to print arrays
    public static<E> void printArray(E[] elements){
        for (E element:elements){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        Integer[] intArr = new Integer[10];
        String[] strArr = new String[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i +1;
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "abc";
        }
        Character[] charArr = {'K','I','N','G'};
        printArray(intArr);
        printArray(strArr);
        printArray(charArr);
    }
}
