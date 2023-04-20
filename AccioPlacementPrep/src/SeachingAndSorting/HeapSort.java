package SeachingAndSorting;

public class HeapSort {
    //Function to sort an array using Heap Sort.
    public void heapSort(int[] arr, int n) {
        buildHeap(arr, n);

        //basically i here represents the decreasing size of the heap and finally only 1 element remains in the heap
        for (int i = n - 1; i >= 1; i--) {
            //swap (arr[i],arr[0])
            //max element go to last position
            //we get array in increasing order
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //but after swap the element at 0 does not follow max heap
            //heapify the 0 index element
            heapify(arr, i, 0); // size of heap is reduce in iteration as 'i' is passed as size and not n
        }
    }

    void buildHeap(int[] arr, int n) {
        //start from last internal node -> node that is not a left node
        //we consider leaf node as max heap individually so ignore this
        //i = (n / 2 - 1) is parent of the last node
        //parent is (i - 1)/2 and last node is n - 1, so parent = (n -2) / 2  or (n / 2 - 1)
        for (int i = (n - 2) / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    //Heapify function to maintain heap property.
    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1; //left child
        int rightChild = 2 * i + 2; //right child

        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        //if the node itself is the largest no need to call heapify() again else we do
        if (largest != i) {
            //swap (arr[largest],arr[i])
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest); //call heapify() for the child
        }
    }
}
