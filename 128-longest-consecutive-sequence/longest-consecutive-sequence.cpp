

class Solution {
public:
    // bool linearsearch(vector<int>& nums, int a) {
    //     int n = nums.size();
    //     for (int i = 0; i < n; i++) {
    //         if (nums[i] == a) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    int longestConsecutive(vector<int>& nums) {

        // int n=nums.size();
        // int count=0;
        // int max_count=0;
        // vector<int>hash;
        // for(int i=0;i<n;i++){
        //     hash[nums[i]]++;

        // }
        // int k=hash.size();
        // for(int i=0;i<k+1;i++){
        //     if(hash[i]==1 && count>=max_count){
        //         count++;
        //         max_count=max(max_count,count);

        //     }
        //     else{
        //         count=0;
        //     }
        //     count++;
        // }
        // return max_count;




        // int n = nums.size();
        // int longest = 1;
        // int count = 1;
        
        // int x;
        // if (n == 0)
        //     return 0;
        // for (int i = 0; i < n; i++) {
        //     x = nums[i];
        //      count = 1;
        //     while (linearsearch(nums, x + 1) == true) {
        //         x = x + 1;
        //         count = count + 1;
        //     }
        //     longest = max(count, longest);
        // }
        // return longest;


        sort(nums.begin(),nums.end());
        int n=nums.size();
        int longest=1;
        int count =0;
        int lastsmaller=INT_MIN;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastsmaller){
                count=count+1;
                lastsmaller=nums[i];
            }
            else if(nums[i]!=lastsmaller){
                lastsmaller=nums[i];
                count=1;
            }
            longest=max(longest,count);

        }
        return longest;




    }
};