import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * 2.1
 * 初始化 ->第一次迭代前为真
 * 保持 -> 如果某次之前为真，其之后也必为真
 * 终止 -> 指明演绎推理的结束部分
 */
class insert {

    public static void main(String[] args) throws Exception {
        int[] input = new int[]{2, 3, 5, 9};
        //当i为最后一个操作数的时候，停止操作
        ArrayList<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            //保持之前的队列是按顺序排好的
            ArrayList<Integer> temp = new ArrayList<>(sorted);
            Collections.sort(sorted, (a, b) -> a.compareTo(b));
            if (!sorted.equals(temp)) throw new Exception("prev is not sorted");
            for (int j = 0; j <= i; j++) {
                if (j == i || input[i] < sorted.get(j)) {
                    sorted.add(j, input[i]);
                    break;
                }

            }
            temp = new ArrayList<>(sorted);
            Collections.sort(sorted, (a, b) -> a.compareTo(b));
            if (!sorted.equals(temp)) throw new Exception("behind is not sorted");


            //保证操作完的队列是按顺序排好的
            temp = new ArrayList<>(sorted);
            Collections.sort(sorted, (a, b) -> a.compareTo(b));
            if (!sorted.equals(temp)) throw new Exception("prev is not sorted");
        }
        System.out.println(sorted);
    }
}


/**
 * 2.1.3 查找一个数组中存在值得下标
 * 注意 满足三个满足循环不变式的条件
 **/
class find_index {
    public static void main(String[] args) throws Exception {
        int input[] = new int[]{1, 3, 5, 6, 7, 8, 9};
        int target = 8;
        int result = 0;
        //终止：当所有的数遍历完，或者找到了就结束遍历
        for (int i = 0; i < input.length; i++) {
            //检查过的所有值中必然不会有已经存在下标的值
            for (int j = 0; j < i - 1; j++) {
                if (input[j] == target)
                    throw new Exception();
            }
            if (input[i] == target) {
                result = i;
                break;
            }
            //处理之后也不会有
            for (int j = 0; j < i; j++) {
                if (input[j] == target)
                    throw new Exception();
            }
        }
        System.out.println(result);
    }
}

/**
 * 2.1.4添加两个长度相同的binary的数组
 * 简单起见，右边看着高位，
 */
class add_two_binary {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 0, 0, 0, 0, 1, 1};
        int[] b2 = new int[]{1, 0, 1, 0, 1, 1, 1};
        int[] b3 = new int[b1.length + 1];
        boolean flag = false;
        for (int i = 0; i < b1.length; i++) {
            // 计算相加
            //检查前n位是否正确
        }

    }
}


/**
 * 分冶算法：
 * 分解：将一个大的问题分解成很多的子问题
 * 解决：递归解决子问题，如果子问题足够小，直接解决
 * 合并：合并子问题为原问题的解
 * 归并排序
 */
class merge_sort {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(4);
        input.add(3);
        input.add(2);
        List<Integer> result = merge_sort_r(input);
        System.out.println(result.toString());
    }

    private static List<Integer> merge_sort_r(List<Integer> input) throws Exception {
        //分冶
        if (input.size() == 1) return input;
        int k = (input.size() - 1) / 2;
        List<Integer> a1 = merge_sort_r(input.subList(0, k+1));
        List<Integer> a2 = merge_sort_r(input.subList(k+1, input.size() ));
        return merge(a1, a2);
    }

    private static List<Integer> merge(List<Integer> a1, List<Integer> a2) throws Exception {

        List<Integer> result = new ArrayList<>();
        for (int left = 0, right = 0; left != a1.size() || right != a2.size(); ) {
            if (left == a1.size()) {
                result.add(a2.get(right++));
            } else if
                    (right == a2.size()) {

                result.add(a1.get(left++));
            } else if (a1.get(left) < a2.get(right))
                result.add(a1.get(left++));
            else
                result.add(a2.get(right++));
        }
        if (result.size() != a1.size() + a2.size())
            throw new Exception(a1.toString() + " ," + a2.toString() + "," + result.toString());
        return result;
    }

}

/**
 * 2.3.3
 * 用数学归纳法证明 辅助度为o(NlgN)
 *  n = 2 =>2
 *  n > 2 => 2T(n/2) + n;  where = n = 2^k

 * 当 n =k +1 时 ，有T(k+1) = 2T(2^k)+2^(k+1) = 2 * 2^k lg 2^k + 2^(k+1) = 2^(k+1)lg(2^(k+1)/2) + 2^(k+1);
 *
 */

/**
 * 2.3-4  写出插入排序最坏情况的递归式
 *  n = 1 =>1
 *  n >= 2 => T(n/1) + n
 *
 */

/**
 * 2.3-5 改进查找问题  并证明最坏情况为lgN
 * T(N) = T(N/2) + 1;
 *
 * T(N) = lgn -2 +1
 * T(N+1) = lg(n+1) -2 +1 = lg(n+1)/2 +1
 */
class _2_3_5{
    public static void main(String[] args) throws Exception {
        int input[] = new int[]{1, 3, 5, 6, 7, 8, 9};
        int target = 8;
        int result = 0;
        result = find(input,0,input.length-1,target);
        System.out.println(result);
    }

    private static int find(int[] input, int i, int i1, int target) throws Exception {
        if (i > i1) throw new Exception(i+","+i1);
        int mid = (i1 - i ) / 2 ;
        if(target == input[i+mid])
            return i+mid;
        else if(target > input[i+mid])
            return find(input,i+mid+1,i1,target);
        else
            return find(input,i,i+mid,target);
    }

}

/**
 * 插入排序中，查找线性排序用二分查找会更加快速吗？
 *
 * 2.3-6 不能 因为最坏的情况下，移动需要更多的占主要的布数。。。
 */

/**
 * 2.3-7 nlgn 确保函数中是否存在两个相同的X
 */

class  _2_3_7{
    public static void main(String[] args) {
        //排序
        //搜索
    }
}

/** ----思考 ------**/

