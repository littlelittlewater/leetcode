/**
 * Given a binary array,
 * find the maximum number of consecutive 1s in this array.
 */
public class _485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tmp  = 0 , max = 0;
        for(int  i = 0 ; i < nums.length ; i ++ ){
            if(nums[i] == 1 ){
                tmp += 1;
                max = Math.max(tmp,max);
            }else tmp = 0;
        }
        return max;
    }

    /** there is a better soluation **/
}
