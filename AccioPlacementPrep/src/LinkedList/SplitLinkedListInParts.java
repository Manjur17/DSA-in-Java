package LinkedList;

public class SplitLinkedListInParts {
    public Node[] splitListToParts(Node head, int k) {
        Node[] ans = new Node[k];

        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int size = n / k;
        int extras = n % k;

        int counter = 1, j = 0;

        Node prev = head;
        Node curr = head;

        while (curr != null) {
            if (counter == size + (extras > 0 ? 1 : 0)) {
                Node next = curr.next;
                ans[j++] = prev;
                curr.next = null;
                curr = prev = next;
                extras--;
                counter = 1;
            } else {
                counter++;
                curr = curr.next;
            }
        }

        return ans;
    }
}
