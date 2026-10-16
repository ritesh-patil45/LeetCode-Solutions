class Solution {
    public boolean validateStackSequences(int[] push, int[] pop){
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int j = 0;
        int n = push.length;
        while(i < n || (!st.isEmpty() && st.peek() == pop[j])){
            if(j == n) break;
            if(!st.isEmpty() && st.peek() == pop[j]){
                st.pop();
                j++;
            }
            else{
                st.push(push[i]);
                i++;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}