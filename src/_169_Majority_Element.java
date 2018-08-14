import java.util.HashMap;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 You may assume that the array is non-empty
 and the majority element always exist in the array.

 Example 1:

 Input: [3,2,3]
 Output: 3

 Example 2:

 Input: [2,2,1,1,1,2,2]
 Output: 2


 */
public class _169_Majority_Element {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++){
            int num = temp.getOrDefault(nums[i],0);
            temp.put(nums[i],num+1);
            if(num + 1 >= nums.length/2 + nums.length%2 ) return  nums[i];
        }
        return 0;
    }
}
