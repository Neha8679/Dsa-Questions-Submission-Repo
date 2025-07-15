class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3){
            return false;
        }
        int con=0;
        int vol=0;
        int i=0;
        while(i<n){
            char ch=word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vol++;
            }
            else if(Character.isLetter(ch)){
                con++;
            }
            else if(!Character.isDigit(ch)){
                return false;

            }
            i++;
        }
        if(vol>=1 && con>=1){
            return true ;
        }
        return false;
    
        
    }
}