/**
 * Implement int sqrt(int x).

 Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

 Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

 Example 1:

 Input: 4
 Output: 2

 Example 2:

 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since
 the decimal part is truncated, 2 is returned.


 */
public class _69_Sqrt {


    public static void main(String[] args) {
        System.out.println(new _69_Sqrt().mySqrt(9));
    }
    public int mySqrt(int x) {
        return  mySqrt(x,0,x);
    }

    //计算的x  计算的范围
    private int mySqrt(int x, int left,int right) {
        int distance = right - left;
        if(distance/2 == 0 ) return  left;
        if((left+distance/2)*(left+distance/2) <= x   )
            return mySqrt(x,left+distance/2,right);
        else
            return  mySqrt(x,left,right-distance/2);

    }
}
