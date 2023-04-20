package BinarySearchQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class StartAndEndIndex {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
//        int startIndex = searchIndex(nums,target,true);
//        int endIndex = searchIndex(nums,target,false);
//        ans[0] = startIndex;
//        ans[1] = endIndex;
        ans[0] = searchIndex(nums,target,true);
        if (ans[0] != -1){
            ans[1] = searchIndex(nums,target,false);
        }
        return ans;
    }
    //generic function to find index
    public static int searchIndex(int[] nums,int target,boolean firstOccurrence){
        int ans = -1;
        int start = 0,end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                ans = mid; //potential answer
                if(firstOccurrence){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = takeInput();
        System.out.println("Enter the target element:");
        int target = s.nextInt();
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
