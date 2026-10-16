class MinStack {

    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(min.isEmpty() || st.peek() <= min.peek()){
            min.push(value);
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            int a = st.pop();
            if(a == min.peek()){
                min.pop();
            }
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        if(min.isEmpty()){
            return -1;
        }
        return min.peek();
    }
}