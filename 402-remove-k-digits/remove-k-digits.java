class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len) return "0";

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < len; i++) {
            char c = num.charAt(i);
            // Remove digits from the stack if they are greater than current digit
            while (k > 0 && !stack.isEmpty() && stack.peekLast() > c) {
                stack.pollLast();
                k--;
            }
            stack.addLast(c);
        }

        // Remove remaining digits from the end if k > 0
        while (k > 0) {
            stack.pollLast();
            k--;
        }

        // Build result string and remove leading zeros
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollFirst());
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
         return sb.length() == 0 ? "0" : sb.toString();
        
    }
}