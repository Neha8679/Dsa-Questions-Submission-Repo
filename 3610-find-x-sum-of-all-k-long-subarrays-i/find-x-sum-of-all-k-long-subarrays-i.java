// class Solution {
//     public int[] findXSum(int[] nums, int k, int x) {
//         int n=nums.length;
//       List<Integer> ans=new ArrayList<>();
       
        
        
//         int z=0;
//         while(z<n-k+1){
//              HashMap<Integer,Integer> map=new HashMap<>();
//              int[] arr2=new int[k];
//             for(int i=z;i<z+k;i++){
//                 arr2[i-z]=nums[i];
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
//             int sum=0;
//             int prevmax=0;
//                 int max=0;
//                 Arrays.sort(arr2);


//             for(int j=k-1;j>=0;j--){
               

               
//                 if(arr2[j]>x){
//                     sum=sum+arr2[j];
//                 }
                
//                 int cnt=0;
//                 if(cnt<x){
//                 if(map.get(arr2[j])==x){
//                     max=arr2[j];
//                     sum=sum+max;
//                     cnt++;

//                 }
//                 }
                
                
//             }
            
//             ans.add(sum);

           
//             z++;

//         }
        
//         int m=ans.size();
//         int[] arr=new int[m];
//         for(int i=0;i<m;i++){
//             arr[i]=ans.get(i);

//         }
//         return arr;
       
//     }
// }


import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[Math.max(0, n - k + 1)];
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        ans[0] = computeXSum(freq, x);

        for (int i = k; i < n; i++) {
            int add = nums[i];
            int rem = nums[i - k];

            freq.put(add, freq.getOrDefault(add, 0) + 1);
            int fr = freq.get(rem) - 1;
            if (fr == 0) freq.remove(rem);
            else freq.put(rem, fr);

            ans[i - k + 1] = computeXSum(freq, x);
        }

        return ans;
    }

    private int computeXSum(Map<Integer, Integer> freq, int x) {
        List<int[]> items = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            items.add(new int[]{e.getKey(), e.getValue()});
        }
        items.sort((a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1];
            return b[0] - a[0];
        });
        long sum = 0;
        int take = Math.min(x, items.size());
        for (int i = 0; i < take; i++) {
            sum += 1L * items.get(i)[0] * items.get(i)[1];
        }
        return (int) sum;
    }
}