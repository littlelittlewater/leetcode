import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/word-pattern/description/
 * <p>
 * Given a pattern and a string str,
 * find if str follows the same pattern.
 * Here follow means a full match,
 * such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Example 1:
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: truekk
 * Example 2:
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * <p>
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space
 */
public class _290_Word_Pattern {
    public static void main(String[] args) {
        System.out.println(new _290_Word_Pattern().wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String str) {
        String[] tmp = new String[26];
        String[] strs = str.split(" ");
        if (pattern.length() != strs.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (tmp[pattern.charAt(i) - 'a'] != null && !tmp[pattern.charAt(i) - 'a'].equals("")) {
                if (!tmp[pattern.charAt(i) - 'a'].equals(strs[i]))
                    return false;
            } else {
                tmp[pattern.charAt(i) - 'a'] = strs[i];

            }
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if(tmp[i] == null) continue;
            if (set.contains(tmp[i])) return false;
            else {
                set.add(tmp[i]);
            }
        }
        return true;
    }
}
