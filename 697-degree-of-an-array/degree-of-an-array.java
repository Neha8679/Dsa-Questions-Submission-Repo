class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
              map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int max=0;
        int values=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>max){
                max=value;
                values=key;
            }
        }
        
        int ans=n;
      
       for (int key : map.keySet()) {
            if (map.get(key) == max) {
                int left = -1, right = -1;
                for (int i = 0; i < n; i++) {
                    if (nums[i] == key) {
                        if (left == -1) left = i; // first occurrence
                        right = i;                // last occurrence
                    }
                }
                ans = Math.min(ans, right - left + 1);
            }
        }


        return ans;

        
    }
}