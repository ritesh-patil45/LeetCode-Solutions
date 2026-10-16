class MinStack {

    Stack<Integer> st;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        if(value <= min){
            st.push(min);
            min = value;
        }
        st.push(value);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            if(st.peek() == min){
                st.pop();
                min = st.peek();
            }
            st.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}