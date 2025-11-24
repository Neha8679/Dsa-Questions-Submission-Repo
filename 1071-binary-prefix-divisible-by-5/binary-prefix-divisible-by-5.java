class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int prefix = 0;

        for (int x : nums) {
            prefix = (prefix * 2 + x) % 5;     // update prefix modulo 5
            ans.add(prefix == 0);              // divisible by 5?
        }

        return ans;
    }
}
