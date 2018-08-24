/*
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (31.84%)
 * Total Accepted:    307.7K
 * Total Submissions: 966.4K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */
class Solution3 {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE ;
        for (String s:strs) minLength = Math.min(minLength,s.length());
        String  result = "";
        boolean flag = true;
        for(int i = 0 ; i< minLength &&flag; i++){
            char tmp = strs[0].charAt(i);
            for (int j =1 ; j <strs.length -1 ; j++){
                if(tmp  !=  strs[j].charAt(i)){
                    flag = false;
                }

            }
            result += tmp;
        }
        return  result;
    }


    public static void main(String[] args) {
        new Solution3().longestCommonPrefix(new String[]{"fdsf","fdsf","fds"});

    }

}
