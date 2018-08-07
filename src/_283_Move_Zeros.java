/**
 * Given an array nums,
 * write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 */
public class _283_Move_Zeros {
    public void moveZeroes(int[] nums) {
        int start = 0 ;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 0)
                ;
            else {
                nums[start++] = nums[i];
                //if there has no moving
                if(start - 1 != i)
                    nums[i] = 0 ;
            }
        }
    }
}
