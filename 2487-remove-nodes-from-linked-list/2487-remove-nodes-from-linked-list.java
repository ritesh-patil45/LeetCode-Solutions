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
        ListNode nh = new ListNode(ans.pop().val);
        ListNode dum = nh;
        while(!ans.isEmpty()){
            ListNode a = new ListNode(ans.pop().val);
            dum.next = a;
            dum = a;
        }
        return nh;
    }
}