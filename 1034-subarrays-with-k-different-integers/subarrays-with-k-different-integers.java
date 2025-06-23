class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
        
    }
    private int atmost(int[] nums,int k){
        int n=nums.length;
        int r=0;
        int l=0;
        int cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            cnt=cnt+(r-l+1);
            r=r+1;

        }
        return cnt;
    }
}