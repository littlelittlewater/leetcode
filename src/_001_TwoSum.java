/*
Given an array of integers, return indices of the two numbers such
that they add up to a specific target.You may assume that each input
would have exactly one solution, and you may not use the same element
twice. Example:
    Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
*/
/**我以为有多组数据呢**/
/** HashMap **/
import java.util.*;

public class _001_TwoSum {
    public static  int[]  twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> stored = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length ; i ++){
            stored.put(nums[i],i);
        }
        Set<Integer> result  = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i ++){
            Integer k = stored.get(target-nums[i]);
            if(k != null && !k.equals(i)){
                result.add(i);
                result.add(k);
            }
        }
        int[] d = new int[result.size()];
        int i = 0;
        for(int j : result){
            d[i++] = j;
        }
        return d ;
    }


/** ---------------brute froce---------------- **/
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


/**-------Approach 2: Two-pass Hash Table---**/

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
