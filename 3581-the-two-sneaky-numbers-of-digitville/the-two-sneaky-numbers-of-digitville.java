class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int firstNumber=0;
        int secondNumber=0;
        int n=nums.length;
        int[] hash=new int[n];

        for(int i=0;i<n;i++){
            hash[nums[i]]++;


        }
        int[] arr=new int[2];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(hash[i]==2&& cnt==0){
                arr[0]=i;
                cnt++;
            }
            else if(hash[i]==2 && cnt==1){
                arr[1]=i;
            }
        }
        if(arr[1]<arr[0]){
            int temp=arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }
        return arr;
        
    }
}