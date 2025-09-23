class StockSpanner {
    public int idx=-1;
    public Stack<int[]> s;


    public StockSpanner() {
        idx=-1;
        s=new Stack<>();
        //s.clear();
        
    }
    
    public int next(int price) {
        idx++;
        while(!s.isEmpty() && s.peek()[0]<=price){
            s.pop();
        }
        int ans=idx-(s.isEmpty()?-1:s.peek()[1]);
        s.push(new int[]{price,idx});
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */