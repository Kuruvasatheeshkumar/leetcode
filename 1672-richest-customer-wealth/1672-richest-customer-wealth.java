class Solution {
    public int maximumWealth(int[][] account) {
        int m = 0;
        for(int i =0;i<account.length ;i++) {
            int s= 0;
            for(int j = 0; j<account[i].length;j++) {
                s += account[i][j];
            }
          m = Math.max(s,m);

        }
            return m;
      }
    }