import base.ListNode;

/**
 *  Given a linked list, determine if it has a cycle in it.
 *  Follow up:
 *  Can you solve it without using extra space?
 */
public class _141_Linked_List_Cycle {

    /**
     * two point
     */
    public boolean hasCycle(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        while (twoStep != null){
            oneStep = oneStep.next;
            if(twoStep.next == null || twoStep.next.next == null) return false;
            twoStep = twoStep.next.next;
            if(oneStep == twoStep)
                return true;
        }
        return  false;
    }
}
