/**
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 */
public class _766_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i =0 ; i < matrix.length -1; i++ )
        {
            int tmp[] = matrix[i];
            for(int j=0 ; j < tmp.length -1 ; j++ )
                if(tmp[j] != matrix[i+1][j+1] ) return false;
        }
        return true;
    }
}
