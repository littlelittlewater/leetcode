import java.util.*;

/**
 * Given a non-empty array of non-negative integers nums,
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 * that has the same degree as nums.
 */

public class _697_Degree_of_an_Array {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 1;
        //values
        ArrayList<Integer> maxHash = new ArrayList<>();
        //  value ,indexs
        HashMap<Integer, ArrayList<Integer>> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> index = new ArrayList<>();
            if (temp.get(nums[i]) != null)
                index = temp.get(nums[i]);
            else temp.put(nums[i], index);

            index.add(i);
            if (index.size() > max) {
                maxHash = new ArrayList<>();
                maxHash.add(nums[i]);
                max = index.size();
            } else if (index.size() == max) {
                maxHash.add(nums[i]);
            }

        }

        int distance = 50000;
        //take the result

        for (Integer i : maxHash) {
            ArrayList<Integer> result = temp.get(i);
            //calc the max instance
            int minNumber = 50000, maxNumber = 0;
            for (Integer j : result) {
                minNumber = Math.min(minNumber, j);
                maxNumber = Math.max(minNumber, j);
            }
            distance = Math.min(distance, maxNumber - minNumber + 1 );
        }

        return distance;
    }


    /**the better solution **/
    public int findShortestSubArray_1(int[] nums) {
        Map<Integer, Integer> left = new HashMap(),
                right = new HashMap(), count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}


