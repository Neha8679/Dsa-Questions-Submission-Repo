// class Solution {
//      static final long MOD = 1_000_000_007;
//     public int[] productQueries(int n, int[][] queries) {
//         StringBuilder binary=new StringBuilder();
//         int num=n;
//         while(num>0){
//             binary.append(num%2);
//             num=num/2;
//         }
//         binary.reverse();
//         List<Integer> powerList=new ArrayList<>();
//         int len=binary.length();
//         for(int i=0;i<len;i++){
//             if(binary.charAt(len-1-i)=='1'){
//                 powerList.add(1<<i);
//             }
           
//         }
//          Collections.sort(powerList);
//          long[] prefixProduct = new long[powerList.size()];
//         prefixProduct[0] = powerList.get(0) % MOD;
//         for (int i = 1; i < powerList.size(); i++) {
//             prefixProduct[i] = (prefixProduct[i - 1] * powerList.get(i)) % MOD;
//         }

//         // Step 5: Answer queries
//         int[] result = new int[queries.length];
//         for (int i = 0; i < queries.length; i++) {
//             int left = queries[i][0];
//             int right = queries[i][1];

//             if (left == 0) {
//                 result[i] = (int) prefixProduct[right];
//             } else {
//                 long inv = modInverse(prefixProduct[left - 1], MOD);
//                 result[i] = (int) ((prefixProduct[right] * inv) % MOD);
//             }
//         }

//         return result;




        
//     }
//     private long modInverse(long a, long mod) {
//         return pow(a, mod - 2, mod);
//     }

//     // Fast exponentiation
//     private long pow(long base, long exp, long mod) {
//         long result = 1;
//         base %= mod;
//         while (exp > 0) {
//             if ((exp & 1) == 1) result = (result * base) % mod;
//             base = (base * base) % mod;
//             exp >>= 1;
//         }
//         return result;
//     }
// }

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int MOD = (int) (1e9 + 7);    
        int q = queries.length;   
        List<Integer> powers = new ArrayList<>(); // This is where we'll store our "special ingredients" (powers of 2)

        // Find all the "special ingredients" that make up the number n
        for (int i = 0; i < 31; i++) {         // We only need to check up to 2^30 because n is less than 10^9
            if ((n >> i & 1) == 1)            // Is the i-th bit of n a "1"? If so, this "special ingredient" is used.
/*
In binary, each number is represented as a sum of powers of two,
 where each power of two is either present (if the bit is 1)
 or absent (if the bit is 0)
*/
                powers.add(1 << i);           // Add this "special ingredient" (power of 2) to our list
        }

        int[] ans = new int[q];              // This is where we'll store the "flavor" (product) for each instruction

        // Follow each instruction and find the "flavor"
        for (int i = 0; i < q; i++) {             // For each instruction...
            int left = queries[i][0];          // The starting position of the ingredients we need to use
            int right = queries[i][1];         // The ending position of the ingredients we need to use
            long product = 1;                   // Start with a "base flavor" of 1. We use long to prevent overflow.

            // Mix the ingredients in the given range
            for (int j = left; j <= right; j++)     // Loop through the ingredient positions
                product = (product * powers.get(j)) % MOD;  // Multiply the current "flavor" with the flavor of this ingredient, then limit the flavor to prevent it from getting too strong.

            ans[i] = (int) product;             // Record the final "flavor" for this instruction
        }

        return ans;                             // Return the "flavor" for all instructions
    }
}