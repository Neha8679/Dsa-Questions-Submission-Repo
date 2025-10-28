// class Solution {
//     public int countValidSelections(int[] nums) {
//         int n=nums.length;
//         int ans=0;
//         int[] arr=new int[n];

//         for(int i=0;i<n;i++){
//             if(i==0){
//                 arr[i]=nums[i];

//             }
//             else{
//                 arr[i]=nums[i]+arr[i-1];

//             }
            
//         }
//         int[] arr2=new int[n];
//         for(int j=n-1;j>=0;j--){
//             if(j==n-1){
//                 arr2[j]=nums[j];
//             }
//             else{
//                 arr2[j]=nums[j]+arr2[j+1];
//             }
//         }
//         for(int k=0;k<n-1;k++){
//             if(nums[k]==0){
//                 if(arr[k]==arr2[k]){
//                     ans=ans+2;
//                 }
//                 else if(Math.abs(arr[k]-arr2[k])==1){
//                     ans=ans+1;
//                 }
//             }
//         }
//         return ans;
        
//     }
// }





class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
            right[n - i - 1] = right[n - i] + nums[n - i];
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;
            if (left[i] == right[i]) count += 2;
            else if (Math.abs(left[i] - right[i]) == 1) count += 1;
        }

        return count;
    }
}
