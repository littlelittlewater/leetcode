import java.util.ArrayList;
import java.util.HashMap;

/**
 *Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 *
 * Note:
 *
 *     Each element in the result should appear as many times as it shows in both arrays.
 *     The result can be in any order.
 */

public class _350_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> s1 =new HashMap<>();
        for(int i : nums1) s1.put(i,s1.getOrDefault(i,0)+1);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : nums2) {
            if(s1.getOrDefault(i,0) > 0){
                s1.put(i,s1.get(i)-1);
                result.add(i);
            }
        }
        int[] re = new int[result.size()];
        for(int i = 0 ;i < result.size();i++){
            re[i] = result.get(i);
        }
        return re ;
    }
}
