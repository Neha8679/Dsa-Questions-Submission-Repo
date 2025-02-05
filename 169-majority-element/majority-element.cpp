class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // int n=nums.size();

        // int x;
        
        // int max_element=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]>max_element){
        //         max_element =nums[i];
        //     }
        // }
        // int k =max_element;
        // vector<int>hash(k+1,0);
        // for(int i=0;i<k;i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=0;i<k;i++){
        //     if(hash[i]>(n/2)){
        //         x=i;

        //     }
        // }
        // return x;
        

        // int n=nums.size();
        
        // int x=-1;
        // for(int i=0;i<n;i++){
        //     int count =0;
            
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
                   
                    
        //         }
        //     }
        //     if(count>n/2){
        //          x=nums[i];
                        
        //     }
            
        // }
        // return x;


        int n=nums.size();
        int x=-1;
        map<int,int>mp;
        for(int i=0;i<n;i++){
            mp[nums[i]]++;

        }
        for(auto it:mp){
            if(it.second>n/2){
                x=it.first;
            }
        }
        return x;
    }
};