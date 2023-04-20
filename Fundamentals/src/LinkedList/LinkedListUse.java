package LinkedList;

public class LinkedListUse {
    public static ListNode<Integer> createLinkedList(){
        //Creating and storing the nodes
        ListNode<Integer> n1 = new ListNode<>(10);
        ListNode<Integer> n2 = new ListNode<>(20);
        ListNode<Integer> n3 = new ListNode<>(30);
        ListNode<Integer> n4 = new ListNode<>(40);
        //Linking the Node
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static void increment(ListNode<Integer> head){
        ListNode<Integer> temp = head;
        while (temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static void printLinkedList(ListNode<Integer> head){
        ListNode<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode<Integer> head = createLinkedList();
        printLinkedList(head);
        increment(head);
        printLinkedList(head);
    }
}
