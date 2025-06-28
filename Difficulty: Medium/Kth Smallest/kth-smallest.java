// User function Template for Java

class Solution {
    public static void minHeap(int[] arr,int N,int i){
        int l=2*i+1;
        int r=2*i+2;
        int smallest=i;
        if(l<N && arr[l]<arr[smallest]){
            smallest=l;
        }
        if(r<N && arr[r]<arr[smallest]){
            smallest=r;
        }
        if(smallest!=i){
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
            minHeap(arr,N,smallest);
        }
    }
    public static void changetoMin(int[] arr){
        int N=arr.length;
        for(int i=(N-2)/2;i>=0;i--){
            minHeap(arr,N,i);
        }
    }
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        changetoMin(arr);
        int N=arr.length;
        for(int i=arr.length-1;i>=arr.length-k+1;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            N--;
            minHeap(arr,N,0);
        }
        return arr[0];
    }
}
