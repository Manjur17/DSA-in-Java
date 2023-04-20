package Heaps;

public class Main {
    public static void main(String[] args) throws PriorityQueueException {
        CustomPriorityQueue<String> pq = new CustomPriorityQueue<>();
        pq.insert("abc",15);
        pq.insert("def",13);
        pq.insert("ghi",90);
        pq.insert("str",150);
        pq.insert("hjg",120);

        while (!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }
    }
}
