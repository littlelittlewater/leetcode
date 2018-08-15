/**
 *Given two strings s and t ,
 *  write a function to determine if t is an anagram of s.
 *  Example 1:
 *  Input: s = "afnagram", t = "anfagram"
 *  Output: true
 *  Example 2:
 *  Input: s = "rat", t = "car"
 *  Output: false
 */
public class _242_Valid_Anagram {
    public static void main(String[] args) {
        System.out.println(new _242_Valid_Anagram().isAnagram("afnagram", "anfagram"));
        System.out.println(new _242_Valid_Anagram().isAnagram("rat", "car"));

    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] map = new int[128];
        for(char a: s.toCharArray()) map[a]+=1;
        for(char b: t.toCharArray()) {
            if(map[b] == 0) return false;
            map[b] -=1;
        }
        return true;
    }

    /** less space **/
    public boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
