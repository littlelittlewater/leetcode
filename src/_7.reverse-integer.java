import javax.security.sasl.SaslClient;
import java.util.Stack;

import static javafx.scene.input.KeyCode.X;

/*
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (24.39%)
 * Total Accepted:    455.1K
 * Total Submissions: 1.9M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of
 * this problem, assume that your function returns 0 when the reversed integer
 * overflows.
 * 
 */
class Solution1 {
    public int reverse(int x) {

        Stack<Integer> tmp =  new Stack<>();
        int flag = 1;
        if(x < 0 ) {
            x *= -1;
            flag = -1;
            if(x >>> 30 >0 ) return  0;
        }
        if(x >>> 30 != 0 ) return  0;
        while (x >= 1){
            tmp.push(x%10);
            x/=10;
        }
        int result = 0 ;
        int now =1 ;
        while (!tmp.empty()){
            result += now * tmp.pop();
            now *=10;
        }
        return flag* result;
    }
}
