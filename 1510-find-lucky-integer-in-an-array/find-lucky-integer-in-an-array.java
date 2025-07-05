class Solution {
    public int findLucky(int[] arr) {
        int count=-1;
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for(int key:map.keySet()){
            if(map.get(key)==key){
                count=key;
            }
        }
        return count;
        
    }
}