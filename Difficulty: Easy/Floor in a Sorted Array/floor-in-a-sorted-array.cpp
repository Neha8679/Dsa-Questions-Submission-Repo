//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:

    int findFloor(vector<int>& arr, int k) {
        

        // Your code here
        int n=arr.size();
        int low=0;
        int high=n-1;
        int result =-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k ){
                return mid;
            }
            else if(arr[mid]<k){
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid -1;
            }
        }
        return result;
    }
};


//{ Driver Code Starts.
int main() {
    string ts;
    getline(cin, ts);
    int t = stoi(ts);
    while (t--) {

        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        string ks;
        getline(cin, ks);
        int k = stoi(ks);
        Solution ob;
        int ans = ob.findFloor(arr, k);

        cout << ans << endl;
    }
    return 0;
}
// } Driver Code Ends