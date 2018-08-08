/**
 *  Given an array with n integers,
 *  your task is to check if it could become non-decreasing by modifying at most 1 element.
 *  We define an array is non-decreasing
 *  if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 */
public class _665_Non_decreasing_Array {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <= 2) return true;
        int count =0 ;
        int last = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ;i ++){
            if(nums[i] < last  ){
                if(i<=2 && nums[i] >= nums[i-1]) {continue;}
                if(i>=3 && nums[i] >= nums[i-1] && nums[i-3] <= nums[i-1]) {last = nums[i-1] ;continue;}
                count += 1;
                if(count == 2) return  false;
                continue;
            }
            last = nums[i];
        }
        return true;
    }
    /**the right **/
    /** or simply the question **/
    /** or force solution **/
    public boolean checkPossibility_1(int[] nums) {
        int p = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                if (p != -1) return false;
                else p = i;
            }
        }
        return (p == -1 ||   // no reversed pair
                p == 1 || p == nums.length - 1 ||  // reversed pair is first or last element
                nums[p - 2] <= nums[p] || nums[p - 1] <= nums[p + 1]); // normal case range [p-2 --> p+1] all valid
    }
}
}
