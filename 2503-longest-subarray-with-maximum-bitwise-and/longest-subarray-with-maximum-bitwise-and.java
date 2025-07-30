// class Solution {
//     public int longestSubarray(int[] nums) {
//         int n=nums.length;
//         int max_value=0;
//         int ans=0;
//         int current_streak=0;
//         for(int i=0;i<n;i++){
//             if(max_value<nums[i]){
//                 max_value=nums[i];
//                 ans=current_streak=0;
//             }
//             if(max_value==nums[i]){
//                 current_streak++;
//             }
//             else{
//                 current_streak=0;
//             }
//             ans=Math.max(ans,current_streak);
//         }
//         return ans;

        
        
//     }
// }


class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
        }
        int streak = 0, maxStreak = 0;
        for (int num : nums) {
            if (num == maxVal) {
                streak++;
                if (streak > maxStreak) maxStreak = streak;
            } else {
                streak = 0;
            }
        }
        return maxStreak;
    }
}