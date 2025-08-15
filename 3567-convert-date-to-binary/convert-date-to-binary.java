// class Solution {
//     public String convertDateToBinary(String date) {
//         String[] parts=date.split("-");
//         int year=Integer.parseInt(parts[0]);
//         int month=Integer.parseInt(parts[1]);
//         int data=Integer.parseInt(parts[2]);
//         String yearBin=toBinary(year);
//         String monthBin=toBinary(month);
//         String dateBin=toBinary(data);
//         return yearBin + "-" +monthBin + "-" + dateBin;

        
//     }
//     public String toBinary(int x){
//         String ans="";
//         while(x!=0){
//             ans=x%2+ans;
//             x=x/2;
//         }
        
//         return ans;
//     }
// }


class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        String[] arr = date.split("-");

        for (String s : arr) {
           sb.append(Integer.toBinaryString(Integer.parseInt(s)));
           sb.append("-");
        }

        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
