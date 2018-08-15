import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 *Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
 *"pwke" is a subsequence and not a substring.

 */
public class _3_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(new _3_Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("aabaab!"));
    }

    /** slide windows **/
    public int lengthOfLongestSubstring(String s) {
        char[] strings = s.toCharArray();
        int max = 0 ;
        int lastindex = 0;
        HashMap<Character,Integer> windows = new HashMap<>();
        for(int i = 0 ; i < strings.length ; i++){
            if( windows.get(strings[i]) == null){
                windows.put(strings[i],i);
                max =  Math.max(windows.size(),max);
            }else {
                /**donot  need so mutch **/
                int index = windows.get(strings[i]);
                for(int j = lastindex ; j <= index ;j++)
                    windows.remove(strings[j]);
                windows.put(strings[i],i);
                lastindex = index + 1 ;
            }
        }
        return  max;

    }
    /**due to not neend the array ,so there is a beter solutions **/
}
