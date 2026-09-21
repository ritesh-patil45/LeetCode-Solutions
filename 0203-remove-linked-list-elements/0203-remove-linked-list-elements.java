class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode pre = new ListNode(-1);
        ListNode cur = head;
        pre.next = cur;
        while(cur.next != null){
            if(cur.val == val){
                if(cur == head) head = head.next;
                cur = cur.next;
                pre.next = cur;
            }
            else{
                cur = cur.next;
                pre = pre.next;
            }
        }
        if(cur.val == val){
            if(cur == head) head = head.next;
            pre.next = null;
        }
        return head;
    }
}