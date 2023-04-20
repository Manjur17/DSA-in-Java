package Heaps;

import java.util.ArrayList;

public class CustomPriorityQueue<T> {
    private final ArrayList<Element<T>> heap;

    public CustomPriorityQueue() {
        heap = new ArrayList<>();
    }

    //insert
    public void insert(T value, int priority) {
        Element<T> e = new Element<>(value, priority);
        heap.add(e);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0 && heap.get(childIndex).priority < heap.get(parentIndex).priority) {
            //swap parent and child
            Element<T> temp = heap.get(childIndex);
            heap.set(childIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
    }

    //get Min
    public T getMin() throws PriorityQueueException {
        if (isEmpty()) {
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

    //remove minimum
    public T removeMin() throws PriorityQueueException {
        if (isEmpty()) {
            throw new PriorityQueueException();
        }
        T ans = heap.get(0).value;
        heap.set(0, heap.get(size() - 1));
        heap.remove(heap.size() - 1);

        int parentIndex = 0;
        int leftChildIndex = 1;
        int rightChildIndex = 2;

        while (leftChildIndex < heap.size()) {
            int minIndex = parentIndex;
            if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                //just break and don't swap
                break;
            }
            //swap
            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
        return ans;
    }

    //size
    public int size() {
        return heap.size();
    }

    //is Empty
    public boolean isEmpty() {
        return size() == 0;
    }
}
