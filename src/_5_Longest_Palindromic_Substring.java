/**
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 */
public class _5_Longest_Palindromic_Substring {


    /** 动态规划   从中间分隔**/
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


    /** 马拉车算法   +#不用处理多余的情况  距离减半用于处理重复情况  **/
    // Transform S into T.
    // For example, S = "abba", T = "^#a#b#b#a#$".
    // ^ and $ signs are sentinels appended to each end to avoid bounds checking
    String preProcess(String s) {
        int n = s.length();
        if (n == 0) return "^$";

        String ret = "^";
        for (int i = 0; i < n; i++)
        {
            ret += "#" + s.substring(i, i + 1);
        }

        ret += "#$";
        return ret;
    }

    public String longestPalindrome_2(String s) {
        String T = preProcess(s);
        int length = T.length();
        int[] p = new int[length];
        int C = 0, R = 0;

        for (int i = 1; i < length - 1; i++)
        {
            int i_mirror = C - (i - C);
            int diff = R - i;
            if (diff >= 0 )//当前i在C和R之间，可以利用回文的对称属性
            {
                if (p[i_mirror] < diff)//i的对称点的回文长度在C的大回文范围内部
                { p[i] = p[i_mirror]; }
                else
                {
                    p[i] = diff;
                    //i处的回文可能超出C的大回文范围了
                    while (T.charAt(i + p[i] + 1) == T.charAt(i - p[i] - 1))
                    { p[i]++; }
                    C = i;
                    R = i + p[i];
                }
            }
            else
            {
                p[i] = 0;
                while (T.charAt(i + p[i] + 1) == T.charAt(i - p[i] - 1))
                { p[i]++; }
                C = i;
                R = i + p[i];
            }
        }

        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < length - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        return s.substring((centerIndex - 1 - maxLen) / 2, (centerIndex - 1 - maxLen) / 2 + maxLen);
    }
}
