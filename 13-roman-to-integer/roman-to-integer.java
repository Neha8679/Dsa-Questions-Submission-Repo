class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int i=0;
        int ans=0;
        while(i<n){
            
            if((i+1)<n && digit(s.charAt(i+1))>digit(s.charAt(i))){
                ans=ans+(digit(s.charAt(i+1))-digit(s.charAt(i)));
                i++;
            }
            else{
                ans=ans+digit(s.charAt(i));
            }
            i++;

        }
        return ans;
        
    }
    public int digit(char ch){
        if(ch=='I'){
            return 1;
           
        }
        else if(ch=='V'){
            return 5;
         
        }
        else if(ch=='X'){
            return 10;
          
        }
        else if(ch=='L'){
            return 50;
           
        }
        else if(ch=='C'){
            return 100;
         
        }
        else if(ch=='D'){
            return 500;
          
        }
        else if(ch=='M'){
            return 1000;
          
        }
         return 0;
    }
}