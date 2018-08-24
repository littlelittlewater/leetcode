import base.*;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class _21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        System.out.println(new _21_Merge_Two_Sorted_Lists().mergeTwoLists(new ListNode(new int[]{1, 2, 4}), new ListNode(new int[]{1, 3, 4})));
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null ) return l1;
        //当有一个递归到尾节点就结束
        ListNode head = new ListNode(-1);
        ListNode tmp = head;

        while (l1 != null && l2!= null) {
            if (l1.val > l2.val) {
                tmp.next = l2;
                l2 = l2.next;
            } else {
                tmp.next = l1;
                l1 = l1.next;
            }
            tmp = tmp.next;
        }
        //总有一个必然为空
        if (l1 == null) tmp.next = l2;
        else tmp.next= l1;
        return head.next;
    }
}
