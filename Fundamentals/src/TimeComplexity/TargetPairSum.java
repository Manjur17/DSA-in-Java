package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class TargetPairSum {
    public static int[] arrayFunction(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("Enter the elements:");
        for (int i=0; i<size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    public static int pairSum(int[] arr, int target) {
        Arrays.sort(arr);
        int startIndex = 0, endIndex = arr.length - 1;
        int numPair = 0;
        while (startIndex < endIndex){
            if (arr[startIndex] + arr[endIndex] < target){
                startIndex++;
            }else if (arr[startIndex] + arr[endIndex] > target){
                endIndex--;
            }else {
                int startElement = arr[startIndex];
                int endElement = arr[endIndex];
                //For case ex- 2,2,2,2,2
                if (startElement == endElement){
                    int totalElements = (endIndex - startIndex) + 1;
                    numPair += (totalElements * (totalElements - 1))/2;
                    return numPair;
                }
                //For cases 1,3,3,3,4,5,8,9,9,9
                int nextStartIndex = startIndex + 1;
                int nextEndIndex = endIndex - 1;
                while (nextStartIndex <= nextEndIndex && arr[nextStartIndex] == startElement){
                    nextStartIndex++;
                }
                while (nextEndIndex >= nextStartIndex && arr[nextEndIndex] == endElement){
                    nextEndIndex--;
                }
                int totalElementsFromStart = nextStartIndex - startIndex;
                int totalElementFromEnd = endIndex - nextEndIndex;
                numPair += (totalElementsFromStart * totalElementFromEnd);
                startIndex = nextStartIndex;
                endElement = nextEndIndex;
            }
        }
        return numPair;
    }

    public static void resultArr(int t){
        Scanner s=new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[] arr = arrayFunction();
            System.out.println("Enter the number whose sums to X:");
            int target = s.nextInt();
            System.out.println("The Total number of pairs present in the array/list: " + pairSum(arr,target));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
