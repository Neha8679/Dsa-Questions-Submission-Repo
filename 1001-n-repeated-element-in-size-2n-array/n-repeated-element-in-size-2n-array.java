class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int m=nums.length;
        int ans=0;
        int n=m/2;
        for(int i=0;i<m;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int size=map.size();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==n){
                ans=entry.getKey();

            }
        }
        return ans;
    }
}