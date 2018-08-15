import java.util.HashMap;
import java.util.HashSet;

/**
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process:
 * Starting with any positive integer,
 * replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class _202_Happy_Number {
    public static void main(String[] args) {
        System.out.println(new _202_Happy_Number().isHappy(82));
    }
    public boolean isHappy(int n) {

        HashSet<Integer> sets = new HashSet<>();
        do {
            sets.add(n);
            int tmp = 0;
            while (n>=1){
                tmp += (n%10)*(n%10);
                n/=10;
            }
            n=tmp;

        } while (!sets.contains(n));
        return n == 1;
    }
}
