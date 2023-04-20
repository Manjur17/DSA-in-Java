package LinkedList;

public class Main {
    public static void main(String[] args) throws LinkedListOutOfBound {
        LinkedList list = new LinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.print();
////        System.out.println(list.size());
        list.insert(0, 100);
        list.print();
        list.insert(1, 18);
        list.print();
        list.insert(2, 23);
        list.print();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        list.print();
        System.out.println(list.delete(2));
        list.print();
        System.out.println(list.size());

//        DoubleLinkedList list = new DoubleLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.print();
//        list.insertLast(99);
//        list.print();
//        System.out.println(list.size());
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        list.insert(0, 65);
//        list.print();
//        System.out.println(list.delete(0));
//        list.print();
//        list.insert(3, 44);
//        list.print();
//        list.insert(list.size(), 78);
//        list.print();

//        CircularLinkedList list = new CircularLinkedList();
//        list.insertFirst(23);
//        list.insertFirst(3);
//        list.insertLast(19);
//        list.insertLast(75);
//        list.print();
//        System.out.println(list.size());
//        list.deleteByKey(23);
//        list.print();
//        list.deleteByKey(19);
//        list.print();
//        list.deleteByKey(3);
//        list.print();
//        list.deleteByKey(75);
//        list.print();
//        System.out.println(list.size());
    }
}
