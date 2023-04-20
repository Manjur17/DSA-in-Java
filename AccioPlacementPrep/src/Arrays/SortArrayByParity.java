package Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                ind++;
            }
        }
        return arr; //we can also return arr instead of creating new one
    }
}
