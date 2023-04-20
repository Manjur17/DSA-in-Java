package LinkedList;

import java.util.Scanner;

public class MergeSortLL {
    public static Node takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int data = s.nextInt();
        Node head = null, tail = null;
        while (data != -1) {
            Node currentNode = new Node(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node mergeSortLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = middleNode(head);
        Node firstHalfHead = head;
        Node secondHalfHead = mid.next;
        mid.next = null;

        firstHalfHead = mergeSortLL(firstHalfHead);
        secondHalfHead = mergeSortLL(secondHalfHead);

        Node ansHead = mergeLL(firstHalfHead, secondHalfHead);
        return ansHead;
    }

    //Mid of LL
    public static Node middleNode(Node head) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //merge function
    public static Node mergeLL(Node firstHead, Node secondHead) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (firstHead != null && secondHead != null) {
            if (firstHead.val <= secondHead.val) {
                tail.next = firstHead;
                firstHead = firstHead.next;
                tail = tail.next;
            } else {
                tail.next = secondHead;
                secondHead = secondHead.next;
                tail = tail.next;
            }
        }
        tail.next = (firstHead != null) ? firstHead : secondHead;
        return dummyHead.next;
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = takeInput();
        head = mergeSortLL(head);
        System.out.println("After Sorting");
        printLinkedList(head);
    }
}
