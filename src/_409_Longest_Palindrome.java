/**
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * <p>
 * Example:
 * <p>
 * Input:
 * "abccccdd"
 * <p>
 * Output:
 * 7
 * <p>
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class _409_Longest_Palindrome {
    public static void main(String[] args) {
        System.out.println(new _409_Longest_Palindrome().longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        int[] map = new int[128];
        int count = 0;
        for (char c : s.toCharArray()) {
           if (map[c] % 2 == 1) count += 2;
            map[c]++;
        }
        for(char c: s.toCharArray()){
            if(map[c]%2 ==1 )      return ++count;
        }
        return count;
    }

}
