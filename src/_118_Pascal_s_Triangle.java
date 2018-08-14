import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given a non-negative integer numRows,
 * generate the first numRows of Pascal's triangle.
 * In Pascal's triangle,
 * each number is the sum of the two numbers directly above it.
 *
 *
 *Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * [1,5,10,10,5,1]
 * ]
 *
 *
 */

public class _118_Pascal_s_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list =new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        if(numRows ==0 )return list;
        list1.add(1);
        list.add(list1);
        if(numRows ==1 )return list;
        int left;     int right;
        for(int i = 1 ; i < numRows ; i ++ ){
            List<Integer> temp  = new ArrayList<>();
            list.add(temp);
            for(int j = 0; j < i +1 ; j++ ){
                if(j==0) left = 0 ;else  left = list.get(i-1).get(j-1);
                if(j==i +1 -1 ) right = 0 ;else  right =list.get(i-1).get(j);
                temp.add(left+right);
            }
        }
        return list;
    }
}
