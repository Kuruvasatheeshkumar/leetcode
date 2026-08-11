class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int sc =0;
        int sr = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        while(sc<=ec && sr<=er){
            for(int j =sc;j<=ec;j++) {
                ans.add(matrix[sr][j]);
            }
            for(int i =sr+1;i<=er;i++) {
                ans.add(matrix[i][ec]);
            }
            for(int j =ec-1;j>=sc;j--) {
                if(sr==er){
                    break;
                }
                ans.add(matrix[er][j]);
            }
            for(int i =er-1;i>=sr+1;i--) {
                if(ec == sc){
                    break;
                }
                ans.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            ec--;
            er--;


        }
        return ans;
        
    }
}