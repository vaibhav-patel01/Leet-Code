class StockSpanner {
    Deque<int[] > stack = new ArrayDeque<>(); 
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1; 
        while(!stack.isEmpty() && price >= stack.peek()[0]){
            span += stack.pop()[1];
        }
        int[] element = new int[2];
        element[0] = price;
        element[1] = span; 
        stack.push(element);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */