class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int cnt1=0;
        int cnt2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1==0 && ele2!=nums[i]){
                cnt1++;
                ele1=nums[i];
            }
            else if(cnt2==0 && ele1!=nums[i]){
                cnt2++;
                ele2=nums[i];
            }
            else if(ele1==nums[i]){
                cnt1++;
            }
            else if(ele2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> list=new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                cnt1++;
            }
            if(nums[i]==ele2){
                cnt2++;
            }
        }
        int x=(int)(n/3)+1;
        if(x<=cnt1){
            list.add(ele1);
        }
        if(x<=cnt2){
            list.add(ele2);
        }
        return list;
        
    }
}