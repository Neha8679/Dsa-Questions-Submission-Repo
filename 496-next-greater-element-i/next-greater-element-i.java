class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nextGreaterElement= new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterElement.put(stack.pop(), num);
            }
            stack.push(num);

        }
        while (!stack.isEmpty()) {
            nextGreaterElement.put(stack.pop(), -1);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterElement.get(nums1[i]);
        }
        return result;
        
    }
}