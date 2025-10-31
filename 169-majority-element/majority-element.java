class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int element=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt++;
                element=nums[i];
            }
            else if(nums[i]==element){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return element;
        
        
    }
}