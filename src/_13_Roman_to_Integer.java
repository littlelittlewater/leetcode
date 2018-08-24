import java.util.HashMap;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * <p>
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example 1:
 * <p>
 * Input: "III"
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: "IV"
 * Output: 4
 * <p>
 * Example 3:
 * <p>
 * Input: "IX"
 * Output: 9
 * <p>
 * Example 4:
 * <p>
 * Input: "LVIII"
 * Output: 58
 * Explanation: C = 100, L = 50, XXX = 30 and III = 3.
 * <p>
 * Example 5:
 * <p>
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
//// TODO: 2018/8/22
public class _13_Roman_to_Integer {


    public static void main(String[] args) {
        System.out.println(new _13_Roman_to_Integer().romanToInt("LVIII"));
    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> levels = new HashMap<>();
        levels.put('I', 1);
        levels.put('V', 5);
        levels.put('X', 10);
        levels.put('L', 50);
        levels.put('C', 100);
        levels.put('D', 500);
        levels.put('M', 1000);

        int last = 0 ;
        int number = 0;
        for(int i = s.length() -1 ; i >= 0 ; i--){
            int cur = levels.get(s.charAt(i));
            if(cur > last){
                number += cur;
                last =cur;
            }else if(cur < last){
                number -= cur;
            }else {
                number+=cur;
            }
        }

        return number;
    }


}
