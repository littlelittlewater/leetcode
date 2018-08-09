import java.util.LinkedList;
import java.util.Queue;

/**
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.
 * You're given a matrix represented by a two-dimensional array,
 * and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * If the 'reshape' operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 *
 *
 * Input:
 * nums =
 * [[1,2],
 *  [3,4]]
 * r = 1, c = 4
 * Output:
 * [[1,2,3,4]]
 *
 *
 *  Input:
 *  nums =
 *  [[1,2],
 *   [3,4]]
 *  r = 2, c = 4
 *  Output:
 *  [[1,2],
 *   [3,4]]
 *
 */
public class _566_Reshape_the_Matrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r *c != nums.length * nums[0].length ) return  nums;
        int[][]  temp = new int[r][c];
        int k = 0 ;
        for(int i = 0 ; i < nums.length ; i ++)
            for(int j = 0 ; j < nums[0].length ; j++,k++)
            {
                int index = i * nums[0].length + j ;
                int r0 = (index ) / c  ;
                int c0 = (index ) % c  ;
                temp[r0][c0] = nums[i][j];
            }
        return  temp;
    }


    /**use queue **/
    public int[][] matrixReshape_1(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int count = 0;
        Queue< Integer > queue = new LinkedList< >();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }


    /** use the extra space **/
    public int[][] matrixReshape_2(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int rows = 0, cols = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols] = nums[i][j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }
}
