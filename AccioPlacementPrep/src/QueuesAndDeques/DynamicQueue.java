package QueuesAndDeques;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {

        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[arr.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[(front + i) % arr.length];
            }
            front = 0;
            rear = arr.length;
            arr = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }
}