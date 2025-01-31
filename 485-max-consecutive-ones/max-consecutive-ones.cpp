class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n=nums.size();
        int count =0;
        int maximum_count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1 && count==maximum_count ){
                count=count+1;
                maximum_count=count;


            }
            else if(nums[i]==1){
                count =count+1;

            }
            else{
                count=0;
            }
        }
        return maximum_count;

        
    }
};
