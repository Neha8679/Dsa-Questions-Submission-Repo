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
        
    }
}