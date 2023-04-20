package LinkedList;

public class MergeLL {
    private static int size = 0;
    private Node head;
    private Node tail;

    //Insert at first Index
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        //no element case
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    //Insert at last Index
    public void insertLast(int value) {
        if (tail == null) {
            //For empty null
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public static MergeLL mergeSortLL(MergeLL first, MergeLL second){
        Node f = first.head;
        Node s = second.head;
        MergeLL ans = new MergeLL();
        while (f != null && s != null){
            if (f.data <= s.data){
                ans.insertLast(f.data);
                f = f.next;
            }else {
                ans.insertLast(s.data);
                s=s.next;
            }
        }
        while (f != null){
            ans.insertLast(f.data);
            f = f.next;
        }
        while (s != null){
            ans.insertLast(s.data);
            s=s.next;
        }
        return ans;
    }

    //Display the LL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MergeLL firstList = new MergeLL();
        firstList.insertLast(1);
        firstList.insertLast(1);
        firstList.insertLast(2);
        firstList.insertLast(3);
        firstList.insertLast(5);

        MergeLL secondList = new MergeLL();
        secondList.insertLast(1);
        secondList.insertLast(2);
        secondList.insertLast(2);
        secondList.insertLast(3);
        secondList.insertLast(5);

        MergeLL ansList = mergeSortLL(firstList,secondList);
        ansList.display();
    }
}
