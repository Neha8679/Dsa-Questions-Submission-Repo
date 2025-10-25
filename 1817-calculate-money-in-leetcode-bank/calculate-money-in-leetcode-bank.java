class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int start = 1; // Monday's starting amount

        for (int i = 0; i < n; i++) {
            ans += start + (i % 7); // Add today's deposit
            if (i % 7 == 6) { // Every Sunday
                start++; // Next week's Monday starts +1 higher
            }
        }

        return ans;
    }
}
