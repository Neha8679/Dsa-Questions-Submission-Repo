class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        
        int n=nums.size();
        if (n == 0 || k % n == 0) return;
         k = k % n;

        vector<int>arr;
        for(int i=n-k;i<n;i++){
            arr.push_back(nums[i]);
        }
        

        for(int i=0;i<n-k;i++){
            arr.push_back(nums[i]);
            


        }
        nums=arr;
        
        
        
    }
};