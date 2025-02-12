//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User code template

class Solution {
  public:
    vector<int> getFloorAndCeil(int x, vector<int> &arr) {
        // code here
        int n=arr.size();
        vector<int>result(2,-1);
        int low=0;
        int high = n-1;
        int t=-1;
        int s=-1;
        sort(arr.begin(),arr.end());
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                t=arr[mid];
                s=arr[mid];
                break;
            }
            else if(arr[mid]>x){
                
                s=arr[mid];
                high=mid-1;
            }
            else if(arr[mid]<x){
               
                t=arr[mid];
                low=mid+1;
            }
             
        }
        result[0]=t;
        result[1]=s;
        return result;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore(); // Ignore the newline character after t
    while (t--) {
        vector<int> arr;
        int x;
        string input;
        cin >> x;
        cin.ignore();

        getline(cin, input); // Read the entire line for the array elements
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }

        Solution ob;
        auto ans = ob.getFloorAndCeil(x, arr);
        cout << ans[0] << " " << ans[1] << "\n~\n";
    }
    return 0;
}
// } Driver Code Ends