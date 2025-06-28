class Solution {
    public void maxHeap(int i, int[] nums, int heapSize) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;

        if (l < heapSize && nums[l] > nums[largest]) {
            largest = l;
        }
        if (r < heapSize && nums[r] > nums[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;
            maxHeap(largest, nums, heapSize);
        }
    }

    public void buildMaxHeap(int[] nums) {
        int N = nums.length;
        for (int i = (N - 2) / 2; i >= 0; --i) {
            maxHeap(i, nums, N);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        buildMaxHeap(nums);
        int heapSize=nums.length;
        for(int i=nums.length-1;i>=nums.length-k+1;i--){
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            heapSize--;
            maxHeap(0,nums,heapSize);
        }
        return nums[0];
        
    }
}