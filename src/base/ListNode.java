package base;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int[] ints){
        ListNode head  = new ListNode(-1);
        ListNode it = head;
        for(int i :ints){
            ListNode next = new ListNode(i);
            it.next = next;
            it = it.next;
        }
        val = head.next.val;
        next = head.next.next;
    }

    public String toString(){
        ListNode tmp = next;
        String str = ""+val;
        while (tmp != null){
            str+=tmp.val;
            tmp=tmp.next;
        }
        return str;
    }
}