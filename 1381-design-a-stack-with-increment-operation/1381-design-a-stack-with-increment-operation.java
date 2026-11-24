class CustomStack {
    Stack<Integer> st = new Stack<>();
    int n;
    public CustomStack(int maxSize) {
        n = maxSize;
    }
    
    public void push(int x) {
        if(st.size() < n){
            st.push(x);
        }
    }
    
    public int pop() {
        if(st.isEmpty()){
            return -1;
        }
        else{
            return st.pop();
        }
    }
    
    public void increment(int k, int val) {
        Stack<Integer> s = new Stack<>();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        while(!s.isEmpty()){
            int a = s.pop();
            if(k > 0) st.push(a + val);
            else st.push(a);
            k--;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */