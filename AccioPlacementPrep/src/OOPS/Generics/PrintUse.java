package OOPS.Generics;

import OOPS.Inheritance.Vehicle;

class BoundGenerics {
    //generic method to print arrays
    public static <T extends Printable> void printArray(T[] elements) {
        //here extends is used and not implements
        for (T element : elements) {
            element.print();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = new Integer[10];
        String[] strArr = new String[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "abc";
        }
        Character[] charArr = {'K', 'I', 'N', 'G'};
        Vehicle[] v = new Vehicle[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = new Vehicle("tata", 4);
        }
        Student[] s = new Student[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student(i * 2);
        }
//        printArray(intArr);
//        printArray(strArr);
//        printArray(charArr);
        printArray(v);
        printArray(s);

    }
}
