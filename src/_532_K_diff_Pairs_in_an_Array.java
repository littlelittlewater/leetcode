import java.util.HashMap;

/**
 * Created by Administrator on 2018/8/9.
 */
public class _532_K_diff_Pairs_in_an_Array {
    public int findPairs(int[] nums, int k) {
        if(k<0) return  0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i : nums) {
            int times = record.getOrDefault(i, 0);
            record.put(i, ++times);
        }
        int count = 0;
        for (int i : record.keySet()) {
            if (record.get(i - k) != null ) {
                    if(k == 0 && record.get(i - k) < 2)  continue;;
                    count++;
            }
        }
        return count;
    }
}