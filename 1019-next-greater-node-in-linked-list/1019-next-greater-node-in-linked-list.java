class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode d = head;
        while(d != null){
            st.push(d.val);
            d = d.next;
        }
        int[] ans = new int[st.size()];
        int i = st.size()-1;
        Stack<Integer> max = new Stack<>();
        while(!st.isEmpty()){
            if(max.isEmpty()){
                max.push(st.pop());
                ans[i] = 0;
                i--;
            }
            else if(st.peek() >= max.peek()){
                while(max.size() > 0 && st.peek() >= max.peek()){
                    max.pop();
                }
                if(max.isEmpty()){
                    ans[i] = 0;
                    i--;
                }
                else{
                    ans[i] = max.peek();
                    i--;
                }
                max.push(st.pop());
            }
            else{
                ans[i] = max.peek();
                i--;
                max.push(st.pop());
            }
        }
        return ans;
    }
}