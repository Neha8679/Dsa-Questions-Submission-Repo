class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        int n=arr.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k && i<n;i++){
            pq.add(arr[i]);
        }
        int index=0;
        for( int i=k+1;i<n;i++){
            
            arr[index++]=pq.poll();
            pq.add(arr[i]);
           
          
        }
        while(!pq.isEmpty()){
            arr[index++]=pq.poll();
            
           
        }
        
    }
}
