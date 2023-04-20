package LinkedList;

public class MultiplyTwoLinkedLists {
    public long multiplyTwoLists(Node head1, Node head2) {
        long N = 1000000007;
        long num1 = 0, num2 = 0;

        while (head1 != null || head2 != null) {

            if (head1 != null) {
                num1 = ((num1) * 10) % N + head1.val;
                head1 = head1.next;
            }

            if (head2 != null) {
                num2 = ((num2) * 10) % N + head2.val;
                head2 = head2.next;
            }

        }
        num1 %= N;
        num2 %= N;
        return (num1 * num2) % N;
    }
}
