class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode s = head;
        ListNode f = head;
        ListNode pre = new ListNode(-1);
        pre.next = s; 
        while(f != null && f.next != null){
            pre = pre.next;
            s = s.next;
            f = f.next.next;
        }
        pre.next = s.next;
        return head;
    }
}