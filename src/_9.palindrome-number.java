import java.util.Stack;

/*
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (37.69%)
 * Total Accepted:    372.7K
 * Total Submissions: 988.8K
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * 
 * Input: 121
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * Follow up:
 * 
 * Coud you solve it without converting the integer to a string?
 * 
 */
//todo need optimise
class Solution {
    public boolean isPalindrome(int x) {
        int start = x ;
        Stack<Integer> tmp = new Stack<>();
        int flag = 1;
        if (x < 0) {
            return false;
        }

        while (x >= 1) {
            tmp.push(x % 10);
            x /= 10;
        }
        int result = 0;
        int now = 1;
        System.out.println(tmp.toString());
        while (!tmp.empty()) {
            result += now * tmp.pop();
            now *= 10;
        }

        return start == result;

    }
}
