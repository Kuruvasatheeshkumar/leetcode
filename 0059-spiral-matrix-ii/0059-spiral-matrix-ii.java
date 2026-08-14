class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int startrow = 0;
        int startcol = 0;
        int endrow = n-1;
        int endcol = n-1;
        int nums =1;
        int total=n*n;
        while(nums<= total){
            for(int i = startcol;i<=endcol;i++){
            res[startrow][i]= nums;
            nums++;
            }
            startrow++;
            for(int i = startrow;i<=endrow;i++) {
                res[i][endcol] = nums;
                nums++;
            }
            endcol--;

            for(int i =endcol;i>=startcol;i--){
                res[endrow][i] = nums;
                nums++;

            }
            endrow--;
            for(int i = endrow;i>=startrow;i-- ) {

                res[i][startcol] = nums;
                nums++;
            }
            startcol++;  
        }
        return res;
        
    }
}