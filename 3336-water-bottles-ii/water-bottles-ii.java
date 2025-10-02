// class Solution {
//     public int maxBottlesDrunk(int numBottles, int numExchange) {
//         int ans=numBottles;;
//         while(numBottles>numExchange){
            
//             numBottles=numBottles/numExchange;
//             ans=ans+numBottles;
//         }
//         return ans;
        
//     }
// }




class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles; // drink all initially
        int empties = numBottles;

        while (empties >= numExchange) {
            empties -= numExchange; // use empties for exchange
            numExchange++;          // cost increases
            ans++;                  // drink new bottle
            empties++;              // now it's empty
        }

        return ans;
    }
}
