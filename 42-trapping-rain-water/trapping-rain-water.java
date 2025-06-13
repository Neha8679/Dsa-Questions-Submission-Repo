class Solution {
    public int trap(int[] height) {
        // int total=0;
        // int n=height.length;
        // int[] prefixmax=new int[n];
        // prefixmax[0]=height[0];
        // for(int i=1;i<n;i++){
        //     prefixmax[i]=Math.max(prefixmax[i-1],height[i]);
        // }
        // int[] suffixmax=new int[n];
        // suffixmax[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     suffixmax[i]=Math.max(suffixmax[i+1],height[i]);
        // }
        // for(int i=0;i<n;i++){
        //     if(height[i]<prefixmax[i] && height[i]<suffixmax[i]){
        //         total+=Math.min(prefixmax[i],suffixmax[i])-height[i];
        //     }
        // }
        // return total; 

        int leftmax=0;
        int rightmax=0;
        int total=0;
        int left=0;
        int n=height.length;
        int right=n-1;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]<leftmax){
                    total+=(leftmax-height[left]);
                }
                else{
                    leftmax=height[left];
                   
                }
                left++;
            }
            else{
                if(height[right]<rightmax){
                    total+=(rightmax-height[right]);
                }
                else{
                    rightmax=height[right];
                    
                }
                right--;
            }
        }
        return total;
        
    }

}