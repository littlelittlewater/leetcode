/**
 * Given a matrix A, return the transpose of A.
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 */
public class _867_Transpose_Matrix {
    public int[][] transpose(int[][] A) {
        if(A.length == 0)  return A;
        int row = A.length;
        int col = A[0].length;
        int[][] B = new int[col][row];

        for(int i =0 ; i < row ; i++)
            for (int j = 0 ; j < col ; j ++ )
                B[j][i] = A[i][j];
        return  B ;
    }
}
