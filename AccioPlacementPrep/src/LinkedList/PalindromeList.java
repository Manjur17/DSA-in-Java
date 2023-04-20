package LinkedList;

public class PalindromeList {
    public Node middleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            return head.val == head.next.val;
        }

        Node mid = middleNode(head);
        Node secondNode = reverseList(mid);
        Node tempNode = secondNode;

        while (secondNode != null) {
            if (head.val != secondNode.val) {
                break;
            }
            head = head.next;
            secondNode = secondNode.next;
        }

        reverseList(tempNode);
        return secondNode == null;
    }
}
