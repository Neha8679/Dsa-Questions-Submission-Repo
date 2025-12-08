class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        int i = 1;

        while (i <= n) {
            for (int k = i + 1; k <= n; k++) {
                int sum = i * i + k * k;   // ✅ fixed sum calculation

                for (int j = 1; j <= n; j++) {
                    if (sum == j * j) {   // ✅ removed pow
                        cnt += 2;
                    }
                }
            }
            i++;
        }
        return cnt;
    }
}
