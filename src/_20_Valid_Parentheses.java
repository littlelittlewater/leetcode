import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * <p>
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * <p>
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 */
//// TODO: 2018/8/22
public class _20_Valid_Parentheses {

    public static void main(String[] args) {
        System.out.println(new _20_Valid_Parentheses().isValid("{[]}"));
    }
    public boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length ; i++) {
            //如果是右括号
            if(isRight(chars[i])){
                if(stack.isEmpty()) return false;
                char tmp = stack.pop();
                if (!vaild(tmp, chars[i]))
                {
                    stack.push(tmp);
                    stack.push(chars[i]);
                }
            }else {
                stack.push(chars[i]);
            }

        }
        return stack.isEmpty();
    }

    private boolean isRight(char a){
        return a == ')' || a == ']' || a == '}' ;
    }

    private boolean vaild(char a, char b) {
        return a == '(' && b == ')' || b == '(' && a == ')'
                || a == '[' && b == ']' || b == '[' && a == ']'
                || a == '{' && b == '}' || b == '{' && a == '}';
    }
}
