class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int> temp;
        int count = 0;
     for(int i = 0; i < nums.size();i++)
     {
        if (nums[i] != 0)
        {
            temp.push_back(nums[i]);
            count++;
        }
      
     } 
     for(int i = count ; i< nums.size(); i++)
     {
        temp.push_back(0);
     }  
     for(int i = 0; i< nums.size(); i++)
     {
        nums[i] = temp[i];
     }
    }
};