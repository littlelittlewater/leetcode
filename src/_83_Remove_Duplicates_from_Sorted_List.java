import base.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
public class _83_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {

        System.out.println(new _83_Remove_Duplicates_from_Sorted_List().deleteDuplicates(new ListNode(new int[]{1,1,2,3,3,4,4})));
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        Integer last = head.val;
        while (tmp!= null && tmp.next != null){
            if(tmp.next.val == last){
                //只有指针前移

                tmp.next = tmp.next.next;
            }else {
                last = tmp.next.val;
                tmp=tmp.next;
            }

        }

        return head;
    }
}
