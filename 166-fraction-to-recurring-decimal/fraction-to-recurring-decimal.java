// class Solution {
//     public String fractionToDecimal(int numerator, int denominator) {
//         int mod=10000;
//         StringBuilder ans=new StringBuilder();
//         if(numerator%denominator ==0){
//         int x=numerator/denominator;
//         ans.append(x);
//         }
//         else{
//             double x=(double) numerator/denominator;
//             ans.append(x);
//         }
//         return ans.toString();
        
//     }
// }



// class Solution {
//     public String fractionToDecimal(int numerator, int denominator) {
//         StringBuilder ans = new StringBuilder();

//         // If divisible exactly
//         if (numerator % denominator == 0) {
//             int x = numerator / denominator;
//             ans.append(x);
//         } 
//         else {
//             // integer part
//             int intPart = numerator / denominator;
//             ans.append(intPart).append(".");

//             // simulate remainder division
//             long num = Math.abs((long)numerator % denominator);
//             long den = Math.abs((long)denominator);

//             Map<Long, Integer> seen = new HashMap<>();

//             while (num != 0) {
//                 if (seen.containsKey(num)) {
//                     int pos = seen.get(num);
//                     ans.insert(pos, "(");
//                     ans.append(")");
//                     break;
//                 }

//                 seen.put(num, ans.length());

//                 num *= 10;
//                 ans.append(num / den);
//                 num %= den;
//             }
//         }
        

//         return ans.toString();
//     }
// }




class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        
        StringBuilder fraction = new StringBuilder();
        if (numerator < 0 ^ denominator < 0)
            fraction.append("-");        

        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        fraction.append(dividend / divisor);
        long remainder = dividend % divisor;
        if (remainder == 0) {
            return fraction.toString();
        }

        fraction.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                fraction.insert(map.get(remainder), "(");
                fraction.append(")");
                break;
            }
            map.put(remainder, fraction.length());
            remainder *= 10;
            fraction.append(remainder / divisor);
            remainder %= divisor;
        }

        return fraction.toString();
    }
}
