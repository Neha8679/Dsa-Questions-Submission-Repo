class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(groupSize==1){
            return true;

        }
        if(n%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(hand[i])){
                for(int j=0;j<groupSize;j++){
                    if(!map.containsKey(hand[i]+j)){
                        return false;
                    }
                }
                for(int j=0;j<groupSize;j++){
                    if(map.get(hand[i]+j)==1){
                        map.remove(hand[i]+j);
                    }
                    else{
                        map.put(hand[i]+j,map.get(hand[i]+j)-1);
                    }
                }
            }
        }
        return true;
        
    }
}