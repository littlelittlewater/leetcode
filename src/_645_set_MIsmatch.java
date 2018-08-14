import java.util.ArrayList;
import java.util.HashMap;

/**
 * The set S originally contains numbers from 1 to n.
 * But unfortunately, due to the data error,
 * one of the numbers in the set got duplicated to another number in the set,
 * which results in repetition of one number and loss of another number.
 * Given an array nums representing the data status of this set after the error.
 * Your task is to firstly find the number occurs twice and then find the number that
 * is missing. Return them in the form of an array.
 */

public class _645_set_MIsmatch {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> tmp = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i ++){
            tmp.put(nums[i],tmp.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer i = 1 ; i <=nums.length;i++){
            if(tmp.getOrDefault(i,0) == 2){
                result.add(i);
            }
        }
        for(Integer i = 1 ; i <=nums.length;i++){
            if(tmp.getOrDefault(i,0) == 0){
                result.add(i);
            }
        }
        int[] d = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            d[i] = result.get(i);
        }

        return d;
    }
}
