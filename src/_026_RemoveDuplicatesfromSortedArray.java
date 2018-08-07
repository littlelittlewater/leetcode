/**
 * Given a sorted array nums, remove the duplicates
 * in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class _026_RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int last = nums[0];
        int start = 0;
        nums[start++] = last;
        for (int i = 0; i < nums.length; i++) {
            //if not equals now or the f
            if (nums[i] != last) {
                nums[start++] = last = nums[i];
            }
        }
        return start;
    }

/** there has a change that he used loop increase the comparing **/
    public int removeDuplicates_1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int idx = 0, lo = 0;
        for (int hi = 1; hi < nums.length; hi++) {
            while (hi < nums.length && nums[lo] == nums[hi]) {
                hi++;
            }

            if (hi < nums.length && nums[lo] != nums[hi]) {
                nums[idx++] = nums[lo];
                lo = hi;
            }
        }

        nums[idx++] = nums[lo];
        return idx;
    }

}
