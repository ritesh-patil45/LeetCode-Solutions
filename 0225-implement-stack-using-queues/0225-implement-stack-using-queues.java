class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size() != 1){
            q2.add(q1.remove());
        }
        int r = q1.remove();
        while(q2.size() != 0){
            q1.add(q2.remove());
        }
        return r;
    }
    
    public int top() {
        while(q1.size() != 1){
            q2.add(q1.remove());
        }
        int t = q1.remove();
        q2.add(t);
        while(q2.size() != 0){
            q1.add(q2.remove());
        }
        return t;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}