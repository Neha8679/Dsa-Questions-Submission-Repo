class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int getmore=target-curr;
            if(map.containsKey(getmore)){
                int[] arr={i,map.get(getmore)};
                if(arr[1]<arr[0]){
                    int temp=arr[1];
                    arr[1]=arr[0];
                    arr[0]=temp;
                }
                return arr;
            }
            map.put(nums[i],i);
        }
        return new int[0];
        
    }
}