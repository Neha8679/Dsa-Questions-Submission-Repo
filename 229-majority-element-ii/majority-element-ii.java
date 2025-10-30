class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int x=0;
        if(n%3==0){
            x=n/3;

        }
        else{
            x=(n/3)+1;
        }
        boolean[] m=new boolean[n];
       List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(m[i]){
                continue;
            }
            int cnt=1;
            m[i]=true;

            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                    m[j]=true;
                    
                }
                

            }if(n%3==0){
                if(cnt>x){
                    ans.add(nums[i]);
                }
            }else{
            if(cnt>=x){
                ans.add(nums[i]);
            }
            }
        }
        
        return ans;
    }
}