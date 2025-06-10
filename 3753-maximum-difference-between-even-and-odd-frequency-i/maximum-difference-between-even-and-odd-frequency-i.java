class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        
       
        for (char c : charArray) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE; 
        
        for (int count : freqMap.values()) {
            if (count % 2 == 0) {
                minEven = Math.min(minEven, count);
            } else {
                maxOdd = Math.max(maxOdd, count);
            }
        }
        
       
        if (minEven == Integer.MAX_VALUE) {
            minEven = 0;
        }

        if (maxOdd == 0 && minEven != 0) {
            maxOdd = 0; 
        }
        
        return (maxOdd-minEven);
    }
}