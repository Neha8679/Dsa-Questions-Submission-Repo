class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int extra=target-curr;
            if(map.containsKey(extra)){
                int[] ans={i,map.get(extra)};
                if(ans[1]<ans[0]){
                    int temp=ans[0];
                    ans[0]=ans[1];
                    ans[1]=temp;
                }
                return ans;
            }
            map.put(curr,i);
        }
        return new int[0];

        
    }
}