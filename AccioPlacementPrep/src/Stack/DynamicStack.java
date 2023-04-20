package Stack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) throws StackException {
        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[arr.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            arr = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}