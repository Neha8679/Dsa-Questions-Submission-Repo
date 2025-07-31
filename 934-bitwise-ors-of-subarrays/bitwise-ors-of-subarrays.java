class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer>currentOr=new HashSet<>();
        Set<Integer>resultOr=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            Set<Integer>nextOr=new HashSet<>();
            nextOr.add(arr[i]);
            for(int y:currentOr){
                nextOr.add(arr[i]|y);
            }
            resultOr.addAll(nextOr);
            currentOr=nextOr;
        }
        return resultOr.size();


        
    }
}