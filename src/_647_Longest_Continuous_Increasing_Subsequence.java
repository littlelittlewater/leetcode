/**
 * Given an unsorted array of integers,
 * find the length of longest continuous increasing subsequence (subarray).
 * <p>
 * Input: [1,3,5,4,7]
 * Output: 3
 * Explanation: The longest continuous increasing subsequence is [1,3,5],
 * its length is 3.
 * Even though [1,3,5,7] is also an increasing subsequence,
 * it's not a continuous one where 5 and 7 are separated by 4.
 * <p>
 * Input: [2,2,2,2,2]
 * Output: 1
 * Explanation: The longest continuous increasing subsequence is [2],
 * its length is 1.
 */
public class _647_Longest_Continuous_Increasing_Subsequence {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length ==0) return 0;
        int last = nums[0];
        int temp = 1;
        int result = 1;
        for (int i = 0; i < nums.length; i++) {

            // if increase
            if (last < nums[i]) {
                temp++;
                if (i == nums.length - 1) {
                    if (temp > result) {
                        result = temp;
                    }
                }
            } else {
                if (temp > result) {
                    result = temp;
                }
                temp = 0;
            }
            last = nums[i];
        }
        return  result;
    }


    //this is a better solution
    public int findLengthOfLCIS_1(int[] nums) {
    if(nums.length==0) return 0;
    int length=1,temp=1;
    //just not check the final element
    for(int i=0; i< nums.length-1 ;i++) {
        if(nums[i]<nums[i+1]) {temp++; length=Math.max(length,temp);}
        else temp=1;
    }
    return length;
}
}
