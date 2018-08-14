import java.util.HashMap;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true
 * if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = temp.getOrDefault(nums[i], 0);
            if (num == 1) return true;
            temp.put(nums[i], num + 1);
        }
        return false;
    }
}
