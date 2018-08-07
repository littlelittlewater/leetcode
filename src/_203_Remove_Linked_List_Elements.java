import base.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 */

/** more repeat **/
public class _203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode realHead = new ListNode(1);
        realHead.next = head;
        ListNode tmp  = realHead;
        while (tmp != null && tmp.next != null){
            //move to next
            if(tmp.next.val == val){
                 /**TODO  the next is never be null  **/
                tmp.next = (tmp.next == null)? null : tmp.next.next;
                continue;
            }
            //continue do
            tmp = tmp.next;
        }
        return  realHead.next ;
    }
}

