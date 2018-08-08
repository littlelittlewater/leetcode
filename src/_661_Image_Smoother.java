/**
 * Given a 2D integer matrix M representing the gray scale of an image,
 * you need to design a smoother to make the gray scale of each cell becomes
 * the average gray scale (rounding down) of all the 8 surroundingcells and itself.
 * If a cell has less than 8 surrounding cells, then use as many as you can.
 */
public class _661_Image_Smoother {
    public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M .length][M[0].length] ;
        for(int i = 0; i< M .length ; i++)
            for(int j =0 ; j< M[0].length ;j++ )
                result[i][j]=colc(M,i,j);
        return  result;
    }

    private int colc(int[][] m, int i, int j) {
        int c1 = i-1 , c2 =i , c3 = i+1;
        int r1 = j-1 , r2 = j , r3 = j+1;
        int number = 1 ,count = m[c2][r2];

        if(c1>=0 && r1>=0) {number ++ ;count+= m[c1][r1];}
        if(c1>=0 ) {number ++ ;count+= m[c1][r2];}
        if(c1>=0 && r3< m[0].length) {number ++ ;count+= m[c1][r3];}
        if(r1 >=0) {number ++ ;count+= m[c2][r1];}
        if(r3< m[0].length) {number ++ ;count+= m[c2][r3];}
        if(c3< m.length && r1>=0) {number ++ ;count+= m[c3][r1];}
        if(c3<m.length ) {number ++ ;count+= m[c3][r2];}
        if(c3<m.length && r3< m[0].length) {number ++ ;count+= m[c3][r3];}
        return count/number;
    }
}
