// class Solution {
//     public int maximumLength(int[] nums) {
//         Map<Integer,Integer> nm=new HashMap<>();
//         for(int i:nums)
//         {
//             nm.put(i, nm.getOrDefault(i,0)+1);
//         }
//         Arrays.sort(nums);
//         int maxi= nm.containsKey(1) ? nm.get(1)%2 == 0 ? nm.get(1)-1 : nm.get(1) : 1;
//         for(int i=0;i<nums.length;i++)
//         {
//             int count=0;
//             int val=nums[i];
//             while(nm.containsKey(val) && nm.get(val)>=2 && val!=1)
//             {
//                 count+=2;
//                 val*=val;
//             }
//             if(nm.containsKey(val))
//             {
//                 count++;
//             }
//             else
//             {
//                 count--;
//             }
//             maxi=Math.max(count,maxi);
//         }
//         return maxi;
//     }
// }



class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int n : nums) {
            frequencies.merge(n, 1, Integer::sum);
        }
        Integer ones = frequencies.remove(1);
        int r = ones == null ? 0 : (ones);
        if (r % 2 == 0) r--;
        r = Math.max(r, 1);
        for (var e : frequencies.entrySet()) {
            if (e.getValue() > 1) {
                r = Math.max(r, count(frequencies, e.getKey()));
            }
        }
        return r;
    }

    static final long MAX_INT_AS_LONG = Integer.MAX_VALUE;

    private static int count(Map<Integer, Integer> frequencies, long key) {
        int r = 1;
        for (long k = key * key; k < MAX_INT_AS_LONG; k = k * k) {
            var f = frequencies.get((int) k);
            if (f == null) return r;
            if (f == 1) return r + 2;
            r += 2;
        }
        return r;
    }
}