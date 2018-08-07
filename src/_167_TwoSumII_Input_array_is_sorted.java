/*
Given an array of integers that is already sorted in ascending order,
find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2.
Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and
you may not use the same element twice.
Example:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
*/


/** Two Point **/
import java.util.HashMap;

public class _167_TwoSumII_Input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= numbers.length; i++) {
            if(map.containsKey(target-numbers[i])){
                if(i+1 < map.get(target-numbers[i]))
                    return new int[] {i+1 ,map.get(target-numbers[i]) +1 };
                return new int[] {map.get(target-numbers[i]) +1 , i+1};
            }
            map.put(numbers[i], i);
        }
        return new int[] {};
    }


    /**the better  **/
    public int[] twoSum_1(int[] numbers, int target) {
        int left = 0 , right = numbers.length - 1;
        while (true){
           if(numbers[left] + numbers[right] == target)
               return new int[]{left+1,right+1};
            if(numbers[left] + numbers[right] < target) left++;
            else right--;
       }
    }
}
