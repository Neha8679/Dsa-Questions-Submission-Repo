class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // Arrays.sort(fruits);
        // Arrays.sort(baskets);
        // int n=fruits.length;
        // int m=baskets.length;
        // int fruitsptr=0;
        // int basketsptr=0;
        // int unplaced=0;
        // while(fruitsptr<n && basketsptr<m){
        //     if(fruits[fruitsptr]<=baskets[basketsptr]){
        //         fruitsptr++;
        //         basketsptr++;
        //     }
        //     else{
        //         basketsptr++;
        //     }
        // }
        // unplaced=n-fruitsptr;
        // return unplaced;


    


        boolean[] used = new boolean[baskets.length];
        int unplaced = 0;

        for (int i = 0; i < fruits.length; i++) {
            boolean placed = false;
            for (int j = 0; j < baskets.length; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++;
            }
        }

        return unplaced;
    }
}
   