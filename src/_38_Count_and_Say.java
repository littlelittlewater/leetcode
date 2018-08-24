import java.util.ArrayList;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "1"
 * <p>
 * Example 2:
 * <p>
 * Input: 4
 * Output: "1211"
 */
public class _38_Count_and_Say {
    public static void main(String[] args) {
        System.out.println(new _38_Count_and_Say().countAndSay(3));
    }

    public String countAndSay(int n) {
        ArrayList<Integer> last = new ArrayList<>();
        last.add(1);

        while (n-- != 0) {
            ArrayList<Integer> now = new ArrayList<>();
            int tmp = -1;
            int count = 1;
            for (int i = 0; i <= last.size() - 1; i++) {
                int integer = last.get(i);
                if (tmp != integer) {
                    //tmp个i
                    now.add(integer);
                    now.add(count);
                    tmp = i;
                    count = 1;
                } else {
                    if (i == last.size() - 1  && tmp == integer) {
                        now.add(integer);
                        now.add(count);
                    } else {
                        count++;
                    }
                }
            }
            last = now;
        }
        String a = "";
        for (int i = last.size() - 1; i >= 0; i--) {
            a += last.get(i);
        }
        return a;
    }


}
