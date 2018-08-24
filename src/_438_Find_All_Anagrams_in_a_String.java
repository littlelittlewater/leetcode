import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 * <p>
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * <p>
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * <p>
 * The order of output does not matter.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s: "cbaebabacd" p: "abc"
 * <p>
 * Output:
 * [0, 6]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * <p>
 * Example 2:
 * <p>
 * Input:
 * s: "abab" p: "ab"
 * <p>
 * Output:
 * [0, 1, 2]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class _438_Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        System.out.println(new _438_Find_All_Anagrams_in_a_String().findAnagrams("aa", "bb"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> that = new HashMap<>();
        HashMap<Character, Integer> tmp = new HashMap<>();
        for(char c: p.toCharArray()) that.put(c, that.getOrDefault(c, 0) + 1);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length() ; i++) {
            System.out.println(tmp.toString());
            if (i < p.length()) {
                tmp.put(s.charAt(i), tmp.getOrDefault(s.charAt(i), 0) + 1);
                if (tmp.equals(that)) result.add(0);
                continue;
            }
            tmp.put(s.charAt(i), tmp.getOrDefault(s.charAt(i), 0) + 1);

            int tmpl = tmp.getOrDefault(s.charAt(i - p.length()), 0) - 1;

            if (tmpl == 0)
                tmp.remove(s.charAt(i - p.length()));
            else
                tmp.put(s.charAt(i - p.length()), tmp.getOrDefault(s.charAt(i - p.length()), 0) - 1);
            if (tmp.equals(that)) result.add(i- p.length()+1);

        }

        return result;
    }


}
