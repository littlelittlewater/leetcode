/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

 Example 1:

 Input: [1,2,3,4,5,6,7] and k = 3
 Output: [5,6,7,1,2,3,4]
 Explanation:
 rotate 1 steps to the right: [7,1,2,3,4,5,6]
 rotate 2 steps to the right: [6,7,1,2,3,4,5]
 rotate 3 steps to the right: [5,6,7,1,2,3,4]

 Example 2:

 Input: [-1,-100,3,99] and k = 2
 Output: [3,99,-1,-100]
 Explanation:
 rotate 1 steps to the right: [99,-1,-100,3]
 rotate 2 steps to the right: [3,99,-1,-100]

 Note:

 Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 Could you do it in-place with O(1) extra space?


 */
public class _189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        if(k >nums.length )
            k =  nums.length - Math.abs (( k -nums.length )% nums.length);
        else k = nums.length - k;
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        swap(nums,0,nums.length-1);
    }

    private void swap (int[] tmp ,int start,int end){
        int tmpp = 0;
        for(int i = 0 ;  i < (end -start +1)/2 ;i++){
            tmpp =  tmp[start +i ];
            tmp[start + i] = tmp[end -i];
            tmp[end -i] = tmpp;
        }
    }


    /** another solution */
    public void rotate_1(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
