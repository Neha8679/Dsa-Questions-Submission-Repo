class Solution {
public:
    bool isPalindrome(int x) {
        long long reversed=0;
        int original =x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int lastDigit=x%10;
            reversed=reversed*10+lastDigit;
            x=x/10;

        }
        return reversed==original;
        
    }
};