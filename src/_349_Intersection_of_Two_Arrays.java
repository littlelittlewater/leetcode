import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 */
public class _349_Intersection_of_Two_Arrays {

    public static void main(String[] args) {
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> s1 =new HashMap<>();
        for(int i : nums1) s1.put(i,s1.getOrDefault(i,0)+1);
        HashSet<Integer> result = new HashSet<>();
        for(int i : nums2) {
            if(s1.getOrDefault(i,0) > 0){
                s1.put(i,s1.get(i)-1);
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray() ;
    }
}
