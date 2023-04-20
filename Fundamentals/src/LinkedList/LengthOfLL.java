package LinkedList;

public class LengthOfLL {
    public static ListNode<Integer> createLinkedList(){
        //Creating and storing the nodes
        ListNode<Integer> n1 = new ListNode<>(10);
        ListNode<Integer> n2 = new ListNode<>(20);
        ListNode<Integer> n3 = new ListNode<>(30);
        ListNode<Integer> n4 = new ListNode<>(-1);
        //Linking the Node
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static int findLength(ListNode<Integer> head){
        ListNode<Integer> temp = head;
        int count = 0;
        while (temp != null && temp.data != -1){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        ListNode<Integer> head = createLinkedList();
        int lengthLL = findLength(head);
        System.out.println("The Length of Linked List is" + " " + lengthLL);
    }
}
