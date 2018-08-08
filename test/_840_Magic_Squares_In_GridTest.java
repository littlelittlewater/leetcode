import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/8.
 */
public class _840_Magic_Squares_In_GridTest {
    @Test
    public void numMagicSquaresInside() throws Exception {
        int[][] test = {{3,2,9,2,7},{6,1,8,4,2},{7,5,3,2,7},{2,9,4,9,6},{4,3,8,2,5}};
        new _840_Magic_Squares_In_Grid().numMagicSquaresInside(test);
    }

}