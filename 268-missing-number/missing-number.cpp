class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // int n= nums.size();
        // // int hash[n];
        
        // for(int i=0;i<=n;i++){
        //     int flag =0;

        //     for (int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             flag=1;
                    

        //         }

            
                
        //     }
        //     if(flag==0){
        //         return i;
        //     }
        // }
        // return 0;





        int n= nums.size();
        int s1;
        int s2=0;
        s1=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            s2=s2+nums[i];
        }
        return s1-s2;


    }
        
    
};