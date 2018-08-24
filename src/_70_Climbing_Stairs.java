/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class _70_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(new _70_Climbing_Stairs().climbStairs(100));
    }
    public int climbStairs(int n) {
        int result = 0;
        for(int i = 0 ; i <= n/2 ; i++){
            result += C(i,n-i);
        }
        return result;
    }

    public int C( int middle,int high) {
        if (middle == 0) return 1;
        int tmp = 1;
        for (int i = 1; i <= middle; i++) {
            tmp *= (high+1-i);
            tmp /= middle;
        }
        return tmp;
    }
}
