class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<n;i++){
            pq.add(stones[i]);

        }
        while(pq.size()>1){
            int x=pq.poll()-pq.poll();
            if(x!=0){
                pq.add(x);
            }
            
        }
        if(pq.size()!=0){
            return pq.poll();
        }
        return 0;
        
    }
}