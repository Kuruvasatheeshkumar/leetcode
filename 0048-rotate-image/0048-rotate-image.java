class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        int ans[][] = new int[n][n];
        for(int i =0;i<n;i++) {
            for(int j =0;j<n;j++) {
                ans[i][j] = matrix[i][j];
            }
            
        }
         for(int i =0;i<n;i++) {
            for(int j =0;j<n;j++) {
                matrix[j][n-i-1]= ans[i][j];
                }
            }    
    }
}