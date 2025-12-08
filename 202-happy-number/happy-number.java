class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
         int sum=0;
        while(sum!=1){
           sum=0;
            while(n!=0){
            int y=n%10;
            sum=sum+(int) Math.pow(y,2);
            n=n/10;
            }
            if(sum==1){
                return true;
            }
           
            if(map.containsKey(sum)){
                return false;
            }
            map.put(sum,1);
            n=sum;
        }
        return true;
        
    }
}