package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();
        list.insertRec(7,3);
        list.display();
//        list.insertLast(99);
//        list.display();
//        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(8));   //gives reference of the node
//        list.insertRec(88, 2);
//        list.display();

//        DoubleLL list = new DoubleLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.display();
//        list.insertLast(99);
//        list.display();
//        list.insert(8, 65);
//        list.display();

//        CircularLL list = new CircularLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();


    }
}

