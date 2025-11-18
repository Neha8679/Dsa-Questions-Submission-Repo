class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] arr = new int[n];

        // place the last k elements at the front
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }

        // place the first n-k elements after them
        for (int i = 0; i < n - k; i++) {
            arr[i + k] = nums[i];
        }

        // copy arr → nums
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}
