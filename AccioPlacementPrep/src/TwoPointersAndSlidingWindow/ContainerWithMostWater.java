package TwoPointersAndSlidingWindow;

public class ContainerWithMostWater {
    public int maxAreaBrute(int[] a) {
        int area = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                area = Math.max(area, Math.min(a[i], a[j]) * (j - i));
            }
        }
        return area;
    }

    public int maxAreaAnother(int[] arr) {
        int start = 0, end = arr.length - 1, area = 0;
        while (start < end) {
            area = Math.max(area, Math.min(arr[start], arr[end]) * (end - start));

            if (Math.min(arr[start], arr[end]) == arr[start])
                start++;
            else
                end--;
        }

        return area;
    }

    public int maxArea(int[] arr) {
        int start = 0, end = arr.length - 1, area = 0;
        while (start < end) {
            area = Math.max(area, Math.min(arr[start], arr[end]) * (end - start));

            if (arr[start] > arr[end])
                end--;
            else
                start++; //arr[i] <= arr[j]
        }
        return area;
    }
}
