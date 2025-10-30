class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);

            }
            else{
                ans.add(Arrays.asList(start,end));
                start=intervals[i][0];
                end=intervals[i][1];
            }

        }
        ans.add(Arrays.asList(start,end));
        int m=ans.size();
        int[][] arr=new int[m][2];
        for(int j=0;j<m;j++){
            arr[j][0]=ans.get(j).get(0);
            arr[j][1]=ans.get(j).get(1);
        }
        return arr;
    }
}