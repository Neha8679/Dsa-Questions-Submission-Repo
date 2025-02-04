class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n=nums.size();
        set<int>s;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    s.insert(i);
                    s.insert(j);
                    vector<int>result(s.begin(),s.end());
                    return result;


                }
            }
        }
        return {};
        
    }
};