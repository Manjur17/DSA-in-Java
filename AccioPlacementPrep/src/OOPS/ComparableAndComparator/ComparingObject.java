package OOPS.ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingObject {

    public static void main(String[] args) {
        Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {kunal, rahul, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() { //sorted using Comparator interface and anonymous class
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

//        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks)); -> descending order
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks)); //sorted using Comparator interface and lambda expressions

//        Arrays.sort(list); //sorted using comparable interface
        System.out.println(Arrays.toString(list));

        if (kunal.compareTo(rahul) < 0) {
            System.out.println(kunal.compareTo(rahul));
            System.out.println("Rahul has more marks");
        }

    }
}
