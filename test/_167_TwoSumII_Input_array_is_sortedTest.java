import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/7.
 */
public class _167_TwoSumII_Input_array_is_sortedTest {
    @Test
    public void twoSum_1() throws Exception {
        _167_TwoSumII_Input_array_is_sorted temp = new _167_TwoSumII_Input_array_is_sorted();
        int[] t1 = {2, 7, 11, 15};
        int[] r1 = {1,2};
        Assert.assertArrayEquals(temp.twoSum_1(t1,9),r1);
        int[] t2 = {2, 5, 7, 15};
        int[] r2 = {1,3};
        Assert.assertArrayEquals(temp.twoSum_1(t2,9),r2);
        int[] t4 = {3,3};
        int[] r4 = {1,2};
        Assert.assertArrayEquals(temp.twoSum_1(t4,6),r4);
    }

    @Test
    public void twoSum() throws Exception {
        _167_TwoSumII_Input_array_is_sorted temp = new _167_TwoSumII_Input_array_is_sorted();
        int[] t1 = {2, 7, 11, 15};
        int[] r1 = {1,2};
        Assert.assertArrayEquals(temp.twoSum(t1,9),r1);
        int[] t2 = {2, 5, 7, 15};
        int[] r2 = {1,3};
        Assert.assertArrayEquals(temp.twoSum(t2,9),r2);
        int[] t4 = {3,3};
        int[] r4 = {1,2};
        Assert.assertArrayEquals(temp.twoSum(t4,6),r4);
    }

}