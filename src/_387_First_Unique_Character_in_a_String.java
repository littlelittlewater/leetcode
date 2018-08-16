/**
 *   Given a string, find the first non-repeating character in it
 *   and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 *
 * Note: You may assume the string contain only lowercase letters.
 */
public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            map[c - 'a'] += 1 ;
        }
        for(int j = 0 ; j < s.length() ; j++)
        {
            char c = s.charAt(j);
           if( map[c - 'a'] == 1 )
               return j;
        }
        return  -1;
    }
}
