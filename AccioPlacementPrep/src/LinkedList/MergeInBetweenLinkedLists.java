package LinkedList;

public class MergeInBetweenLinkedLists {
    public Node mergeInBetween(Node list1, int a, int b, Node list2) {
        Node temp1 = list1, temp = list1;

        for (int i = 0; i <= b; i++) {
            if (i + 1 == a) temp1 = temp;
            temp = temp.next;
        }

        temp1.next = list2;
        Node tail = list2;
        while (tail.next != null)
            tail = tail.next;

        tail.next = temp;

        return list1;
    }
}
