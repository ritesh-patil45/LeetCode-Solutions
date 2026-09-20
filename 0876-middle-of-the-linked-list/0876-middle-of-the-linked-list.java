class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null){
            slow = slow.next;
            if(fast.next.next == null) break;
            fast = fast.next.next;
        }
        return slow;
    }
}