class Solution {
    public int pairSum(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode d = head;
        int count = 1;
        while(d != null){
            st.push(d);
            d = d.next;
            count++;
        }
        count = count/2 - 1;
        int max = 0;
        while(count >= 0){
            int sum = st.pop().val + head.val;
            count--;
            max = Math.max(max, sum);
            head = head.next;
        }
        return max;
    }
}