/**
 *
 * In a given integer array nums,
 * there is always exactly one largest element.
 * Find whether the largest element in the array is
 * at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, otherwise return -1.
 */
public class _747_Largest_Number {
    public int dominantIndex(int[] nums) {
        int max = 0 , max_2 = 0, index =0;
        for(int i = 0 ; i < nums.length ; i ++ ) {
            if(nums[i] > max_2 && nums[i] < max )
                max_2 = nums[i];
            else if( nums[i] > max ){
                max_2 =max;
                max = nums[i];
                index = i;
            }

        }
        if(max >= max_2 * 2 )
            return index;
        else
            return -1;

    }
}
