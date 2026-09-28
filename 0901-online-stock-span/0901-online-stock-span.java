class StockSpanner {
    Stack<Integer> prices = new Stack<>();
    Stack<Integer> spans = new Stack<>();
    public StockSpanner() {
    }
    
    public int next(int price) {
        int span = 1;
        while(!prices.isEmpty() && price >= prices.peek()){
            span += spans.pop();
            prices.pop();
        }
        prices.push(price);
        spans.push(span);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */