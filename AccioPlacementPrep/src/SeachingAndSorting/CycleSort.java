package SeachingAndSorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {10, 1, 8, 3, 9, 10, 2, 4};
        int n = arr.length;
        cycleSort(arr, n);
        System.out.print(Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr, int n) {

        // traverse array elements and put it to on the right place
        for (int cycle = 0; cycle <= n - 2; cycle++) {

            int item = arr[cycle];

            // Find position where we put the item. We basically count all smaller elements on right side of item.
            int position = cycle;
            for (int i = cycle + 1; i < n; i++) {
                if (arr[i] < item)
                    position++;
            }
            // If item is already in correct position
            if (position == cycle)
                continue;

            // ignore all duplicate elements
            while (item == arr[position])
                position += 1;

            // put the item to it's right position
            if (position != cycle) {
                int temp = item;
                item = arr[position];
                arr[position] = temp;
            }

            // Rotate rest of the cycle
            while (position != cycle) {
                position = cycle;

                // Find position where we put the element
                for (int i = cycle + 1; i < n; i++)
                    if (arr[i] < item)
                        position += 1;

                // ignore all duplicate elements
                while (item == arr[position])
                    position += 1;

                // put the item to it's right position
                if (item != arr[position]) {
                    int temp = item;
                    item = arr[position];
                    arr[position] = temp;
                }
            }
        }
    }

}
