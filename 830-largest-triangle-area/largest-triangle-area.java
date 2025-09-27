// class Solution {
//     public double largestTriangleArea(int[][] points) {
//         int n=points.length;
//         int maxxpoint=0;
//         int maxypoint=0;
//         int minxpoint=Integer.MIN_VALUE;
//         int minypoint=Integer.MIN_VALUE;
        
//         double area=0;
//         for(int i=0;i<n;i++){
//             maxxpoint=Math.max(maxxpoint,points[i][0]);
//             maxypoint=Math.max(maxypoint,points[i][1]);
//             minxpoint=Math.min(minxpoint,points[i][0]);
//             minypoint=Math.min(minypoint,points[i][1]);

//         }
//         area=(maxxpoint-minxpoint)*(maxypoint-minypoint);
//         area=area/2;
//         return area;

        
//     }
// }



class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    double area = 0.5 * Math.abs(
                        points[i][0] * (points[j][1] - points[k][1]) +
                        points[j][0] * (points[k][1] - points[i][1]) +
                        points[k][0] * (points[i][1] - points[j][1])
                    );
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        
        return maxArea;
    }
}
