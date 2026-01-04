class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int k : nums) {
            int cnt = 0;
            int sum = 0;

            for (int d = 1; d * d <= k; d++) {
                if (k % d == 0) {
                    cnt++;
                    sum += d;

                    if (d != k / d) {
                        cnt++;
                        sum += k / d;
                    }
                }
                if (cnt > 4) break;
            }

            if (cnt == 4) ans += sum;
        }

        return ans;
    }
}
