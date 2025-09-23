// class Solution {
//     public int compareVersion(String version1, String version2) {
//         // int m=version1.length();
//         // int n=version2.length();
        
//         // int r1=0;

//         // int r2=0;
//         // StringBuilder ans1=new StringBuilder();
       
//         // StringBuilder ans2=new StringBuilder();
//         // for(int i=0;i<m;i++){
//         //     char ch=version1.charAt(i);
//         //     if(ch=='.'){
//         //         r1++;

                

//         //     }
//         //     if(r1>0 && ch!='.'){
//         //         ans1=ans1.append(ch);
//         //     }
//         // }
//         // for(int i=0;i<n;i++){
//         //     char ch=version2.charAt(i);
//         //     if(ch=='.'){
//         //         r2++;
//         //     }
//         //     if(r2>0 && ch!='.'){
//         //         ans2=ans2.append(ch);
//         //     }
//         // }
//         // //int len=Math.max(ans1.length(),ans2.length());
//         // if(r1!=r2 ){
//         // for(int i=0;i<Math.abs(ans1.length()-ans2.length());i++){
//         //     if(ans1.length()>ans2.length()){
//         //         ans2.append(0);
//         //     }
//         //     else{
//         //         ans1.append(0);
//         //     }
//         // }
//         // }
//         // int num1=ans1.length()==0?0:Integer.parseInt(ans1.toString());
//         // int num2=ans2.length()==0?0:Integer.parseInt(ans2.toString());
//         // if(num1<num2){
//         //     return -1;
//         // }
//         // else if(num1>num2){
//         //     return 1;
//         // }
//         // return 0;
        
//     }
// }


class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int len = Math.max(v1.length, v2.length);

        for (int i = 0; i < len; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }
        return 0;
    }
}
