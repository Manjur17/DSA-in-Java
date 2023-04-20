package Arrays;
import java.util.*;
public class IntersectionLeetcode {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }

        for(int i:set1){
            if(set2.contains(i)){
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0 ;
        for(int i:intersection){
            result[index++]=i;
        }

        return result;
    }
}
