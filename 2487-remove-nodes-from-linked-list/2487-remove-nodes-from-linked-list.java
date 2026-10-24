class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode d = head;
        while(d != null){
            st.push(d);
            d = d.next;
        }
        Stack<ListNode> ans = new Stack<>();
        while(!st.isEmpty()){
            if(ans.isEmpty()){
                ans.push(st.pop());
            }
            else if(st.peek().val < ans.peek().val){
                st.pop();
            }
            else{
                ans.push(st.pop());
            }
        }
        ListNode nh = ans.pop();
        ListNode dum = nh;
        while(!ans.isEmpty()){
            dum.next = ans.pop();
            dum = dum.next;
        }
        dum.next = null;
        return nh;
    }
}