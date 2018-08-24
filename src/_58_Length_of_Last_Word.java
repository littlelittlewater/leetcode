/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 Example:

 Input: "Hello World"
 Output: 5

 */
public class _58_Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(new _58_Length_of_Last_Word().lengthOfLastWord("Hello world"));
    }
    public int lengthOfLastWord(String s) {
        int lastInex = -1 ;
        for(int i = 0 ; i < s.length() ; i++)
            if(s.charAt(i) ==' ') lastInex = i;
        return lastInex;
    }
}
