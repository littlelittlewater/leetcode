import java.util.ArrayList;
import java.util.Collection;

/**
 * Given an array of integers nums,
 * write a method that returns the "pivot" index of this array.
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 * If no such index exists,we should return -1.
 * If there are multiple pivot indexes, you should return the left-most pivot index.
 */
public class _724_Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        if (nums.length < 3) return -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++)
            count += nums[i];
        int tmp = 0 ;
        for(int j = 0 ; j < nums.length;j ++){
            if(tmp *2 == count - nums[j])
                return j;
            tmp += nums[j];
        }
        return  -1 ;
    }

}
