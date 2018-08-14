/***
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Input: [1,3,5,6], 5
 * Output: 2
 * Input: [1,3,5,6], 5
 * Output: 2
 */

public class _35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= target) return i;
        }
        return nums.length;
    }

    /** lgN **/
    public int searchInsert_1(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
