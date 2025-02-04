class Solution {
public:
    int singleNumber(vector<int>& nums) {
        // int maxi=nums[0];
        // int n=nums.size();
        // for(int i=0;i<n;i++){
        //     if(nums[i]>maxi){
        //         maxi=nums[i];
        //     }
        // }
       
        // int hash[maxi]={0};
        // for(int i=0;i<k;i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=0;i<k;i++){
        //     if(hash[i]==1){
        //         return i;
        //     }
        // }


        int n=nums.size();
        int x;
        map<int,int>m;
        for(int i=0;i<n;i++){
            m[nums[i]]++;
        }
        for(auto it:m){
            if(it.second==1){
                x= it.first;
            }
        }
        return x;


        
    }
};