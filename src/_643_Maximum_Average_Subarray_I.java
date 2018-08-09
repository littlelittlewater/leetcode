/**
 *  Given an array consisting of n integers,
 *  find the contiguous subarray of given length k that has the maximum average value.
 *  And you need to output the maximum average value.
 *  Example 1:
 *  Input: [1,12,-5,-6,50,3], k = 4
 *  Output: 12.75
 *  Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *
 *  https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
public class _643_Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        if(k > nums.length) return  0;
        int count =0 ;
        int temp = 0 ;
        for(int j = 0 ; j < k ; j ++)
            temp += nums[j];
        for(int i = 0; i <nums.length - k ; i++){
            temp = temp -nums[i] + nums[i +k];
            if(temp >count) count=temp;
        }
        return 1.0*count/k;
    }
}
