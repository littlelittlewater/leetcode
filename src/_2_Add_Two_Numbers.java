import base.*;
import base.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class _2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //l1 = reverse(l1);
        //l2=reverse(l2);
        ListNode head = new ListNode(1);
        ListNode rHead = head;
        boolean isJinWei = false;
        while (l1!=null || l2!=null){
            int value = 0 ;
            if(l1 != null ) {value += l1.val; l1 = l1.next;  }
            if(l2 != null ) {value += l2.val; l2 = l2.next;  }
            if(isJinWei) {
                value+= 1;
                isJinWei = false;
            }
            if(value > 9 ) {
                isJinWei = true;
                value -= 10;
            }
            ListNode node = new ListNode(value);
            head.next = node;
            head = node;
        }
        if(isJinWei){
            ListNode last = new ListNode(1);
            head.next = last;
        }
        return rHead.next;
    }

    /**数组反转**/
    private ListNode reverse(ListNode l1) {
        ListNode last = null ;
        while(l1.next != null){
            ListNode tmp =  l1.next;
            l1.next = last;
            last = l1 ;
            l1 = tmp;
        }
        l1.next = last;
        return  l1 ;
    }


    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
}
