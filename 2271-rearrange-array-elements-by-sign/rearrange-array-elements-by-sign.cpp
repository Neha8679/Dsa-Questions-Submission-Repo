class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        // int n=nums.size();
        // vector<int>pos;
        // vector<int>neg;
        // for(int i=0;i<n;i++){
        //     if(nums[i]<0){
        //         neg.push_back(nums[i]);

        //     }
        //     else{
        //         pos.push_back(nums[i]);


        //     }
        // }
        // for(int i=0;i<n/2;i++){
        //     nums[2*i]=pos[i];
        //     nums[2*i+1]=neg[i];
        // }
        // return nums;
        

        int n=nums.size();
        vector<int>hash(n,0);
        int pos_index=0;
        int neg_index=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                hash[neg_index]=nums[i];
                neg_index=neg_index+2;
                

            }
            else{
                hash[pos_index]=nums[i];
                pos_index=pos_index+2;

                
            }


        }
        return hash;
    }
};