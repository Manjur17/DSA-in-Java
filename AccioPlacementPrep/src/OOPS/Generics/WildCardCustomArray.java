package OOPS.Generics;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// here T should either be Number or its subclasses
public class WildCardCustomArray <T extends Number> {

    private Object[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardCustomArray() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        // do something
        //now we can add number and its subclasses like int,float,double inside list
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        return (T)(data[--size]);
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        WildCardCustomArray list = new WildCardCustomArray();
//        list.add(3);
//        list.add(5);
//        list.add(9);

//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }

//        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("dfghj");


        WildCardCustomArray<Integer> list3 = new WildCardCustomArray<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);

    }
}
