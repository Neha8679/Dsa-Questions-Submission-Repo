class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int moreNeeded=target-curr;
            if(map.containsKey(moreNeeded)){
                int[] arr={i,map.get(moreNeeded)};
                if(arr[1]<arr[0]){
                    int temp=arr[0];
                    arr[0]=arr[1];
                    arr[1]=temp;
            


                }
                return arr;
                
            }
            map.put(nums[i],i);
        }
        return new int[0];
        

        
    }
}