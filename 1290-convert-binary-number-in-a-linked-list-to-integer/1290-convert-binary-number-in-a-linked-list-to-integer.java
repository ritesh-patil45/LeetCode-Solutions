class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while(head != null){
            int val = head.val;
            ans = ans * 2 + val;
            head = head.next;
        }
        return ans;
    }
}