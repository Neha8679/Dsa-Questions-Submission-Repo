class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> rows=new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                rows.set(j,val);
            }
            ans.add(rows);
        }
        return ans.get(rowIndex);
        
    }
}