class Solution {
    int gcd(int x, int y){
        int min = Math.min(x, y);
        for(int i=min ; i>=1 ; i--){
            if(x % i == 0 && y % i == 0){
                return i;
            }
        }
        return 1;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode a = head.next;
        ListNode b = head;
        while(a != null){
            int v = gcd(a.val, b.val);
            ListNode n = new ListNode(v);
            b.next = n;
            n.next = a;
            b = b.next.next;
            a = a.next;
        }
        return head;
    }
}