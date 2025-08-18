// class Solution {
//     final double EPS = 1e-6;

//     public boolean judgePoint24(int[] cards) {
//         List<Double> nums = new ArrayList<>();
//         for (int n : cards) nums.add((double) n);
//         return dfs(nums);
//     }

//     private boolean dfs(List<Double> nums) {
//         if (nums.size() == 1) {
//             return Math.abs(nums.get(0) - 24.0) < EPS;
//         }
//         for (int i = 0; i < nums.size(); i++) {
//             for (int j = 0; j < nums.size(); j++) {
//                 if (i == j) continue;
//                 List<Double> next = new ArrayList<>();
//                 for (int k = 0; k < nums.size(); k++) {
//                     if (k != i && k != j) next.add(nums.get(k));
//                 }
//                 for (double val : compute(nums.get(i), nums.get(j))) {
//                     next.add(val);
//                     if (dfs(next)) return true;
//                     next.remove(next.size() - 1);
//                 }
//             }
//         }
//         return false;
//     }

//     private List<Double> compute(double a, double b) {
//         List<Double> res = new ArrayList<>();
//         res.add(a + b);
//         res.add(a - b);
//         res.add(b - a);
//         res.add(a * b);
//         if (Math.abs(b) > EPS) res.add(a / b);
//         if (Math.abs(a) > EPS) res.add(b / a);
//         return res;
//     }
// }

// 0 ms. 100%
class Solution {
    private static final double EPS = 1e-6;
    private boolean backtrack(double[] A, int n) {
        if(n == 1) return Math.abs(A[0] - 24) < EPS;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                double a = A[i], b = A[j];
                A[j] = A[n-1];
                A[i] = a + b;
                if(backtrack(A, n - 1)) return true;
                A[i] = a - b;
                if(backtrack(A, n - 1)) return true;
                A[i] = b - a;
                if(backtrack(A, n - 1)) return true;
                A[i] = a * b;
                if(backtrack(A, n - 1)) return true;
                if(Math.abs(b) > EPS) {
                    A[i] = a / b;
                    if(backtrack(A, n - 1)) return true;
                }
                if(Math.abs(a) > EPS) {
                    A[i] = b / a;
                    if(backtrack(A, n - 1)) return true;
                }
                A[i] = a; A[j] = b;
            }
        }
        return false;
    }
    public boolean judgePoint24(int[] nums) {
        double[] A = new double[nums.length];
        for(int i = 0; i < nums.length; i++) A[i] = nums[i];
        return backtrack(A, A.length);
    }
}



