import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Given a non-negative index k where k ≤ 33,
 * return the kth index row of the Pascal's triangle.
 * Note that the row index starts from 0.
 * In Pascal's triangle,
 * each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 *
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 */
public class _119_Pascal_s_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new LinkedList<>();
        res.add(1);
        if (rowIndex == 0) return res;
        int t = rowIndex, b = 1;
        long cur = 1;
        for(int i = 1; i < rowIndex+1; i++){
            cur = cur * t;
            cur = cur / b;
            res.add((int)cur);
            t--;b++;
        }
        return res;
    }
}
