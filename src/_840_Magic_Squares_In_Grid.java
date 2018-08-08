/**
 * A 3 x 3 magic square is a 3 x 3 grid filled
 * with distinct numbers from 1 to 9 such that each row,
 * column, and both diagonals all have the same sum.
 * Given an grid of integers, how many 3 x 3 "magic square"
 * subgrids are there?  (Each subgrid is contiguous).
 */

/** not solved **/
public class _840_Magic_Squares_In_Grid {
    public int numMagicSquaresInside(int[][] grid) {

        int result = 0 ;
        int col = grid.length;
        int row = grid[0].length;
        for(int i = 0 ; i <= col -3 ; i ++){
            for(int j = 0 ; j <= row-3; j ++){

                int tmp = grid[i][j] + grid[i+1][j+1] +grid[i+2][j+2] ;
                if(!magic(grid,i,j) || tmp != 15
                        || tmp != grid[i][j] + grid[i+1][j] +grid[i+2][j]
                        || tmp != grid[i][j+1] + grid[i+1][j+1] +grid[i+2][j+1]
                        || tmp != grid[i][j+2] + grid[i+1][j+2] +grid[i+2][j+2]
                        || tmp != grid[i][j+1] + grid[i][j] +grid[i][j+2]
                        || tmp != grid[i+1][j+1] + grid[i+1][j] +grid[i+1][j+2]
                        || tmp != grid[i+2][j+1] + grid[i+2][j] +grid[i+2][j+2]
                        || tmp != grid[i+0][j+2] + grid[i+1][j+1] +grid[i+2][j+0])
                    continue;
                result ++ ;
            }
        }
        return  result;
    }
    public boolean magic(int[][] vals ,int i,int j) {
        int[] count = new int[16];
        for(int ti =0 ; ti< 3 ;ti ++)
            for (int tj=0 ; tj <3 ; tj++)
                count[vals[ti][tj]] =1 ;
        for (int v = 1; v <= 9; ++v)
            if (count[v] != 1)
                return false;
        return true;
    }
}
