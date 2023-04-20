package QueuesAndDeques;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(19);
//        queue.add(1);
//        System.out.println(queue.size());
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.add(133);
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.add(99);
//        queue.display();
//        System.out.println(queue.size());
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
////        System.out.println(queue.remove());
//
//        queue.display();
//        System.out.println(queue.peek());
//        System.out.println(queue.size());

        CircularQueue queueC = new CircularQueue(5);
        queueC.insert(3);
        queueC.insert(6);
        queueC.insert(5);
        queueC.insert(19);
        queueC.insert(1);
//        queueC.insert(7);
        queueC.display();
//
        System.out.println(queueC.remove());
        queueC.display();
        queueC.insert(133);
        queueC.display();

        System.out.println(queueC.remove());
        queueC.display();
        queueC.insert(99);
        queueC.display();

//        queueC.insert(44);
    }
}
