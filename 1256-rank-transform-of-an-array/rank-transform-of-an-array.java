class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans=arr.clone();
        Arrays.sort(arr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<ans.length;i++){
            map.putIfAbsent(arr[i],map.size()+1);
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(ans[i]);
        }
        return ans;

        // int n=arr.length;
        // PriorityQueue <int[]> pq= new PriorityQueue<>(new Comparator<int[]>(){
        //     public int compare(int[]x,int[]y){
        //         return x[0]-y[0];
        //     }
        // });
        // for(int i=0;i<n;i++){
        //     pq.offer(new int[]{arr[i],i});
        // }
        // int rank=0;
        // int prev=Integer.MAX_VALUE;
        // while(!pq.isEmpty()){
        //     int cur[]=pq.poll();
        //     if(prev!=cur[0]){
        //         prev=cur[0];
        //         rank++;
        //     }
        //     arr[cur[1]]=rank;
        // }
        // return arr;
        
    }
}