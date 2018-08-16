/**
 * https://leetcode.com/problems/word-pattern/description/
 *
 *  Given a pattern and a string str,
 *  find if str follows the same pattern.
 *  Here follow means a full match,
 *  such that there is a bijection between a letter in pattern and a non-empty word in str.
 *
 *  Example 1:
 *  Input: pattern = "abba", str = "dog cat cat dog"
 *  Output: truekk
 *  Example 2:
 *  Input:pattern = "abba", str = "dog cat cat fish"
 *  Output: false
 *  Example 3:
 *  Input: pattern = "aaaa", str = "dog cat cat dog"
 *  Output: false
 *  Example 4:
 *  Input: pattern = "abba", str = "dog dog dog dog"
 *  Output: false
 *
 *  You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space
 */
public class _209_Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
        String [] tmp = new String[24];
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length) return false;
        for(int i = 0 ; i < pattern.length() ;i ++ ){
             if( tmp [pattern.charAt(i) - 'a'] != null && !tmp[pattern.charAt(i)-'a'] .equals("")){
                 if(!tmp[pattern.charAt(i) -'a'] .equals(strs[i]))
                     return false;
             }else {
                 tmp[pattern.charAt(i)- 'a'] = strs[i];

             }
        }
        return  true;
    }
}
