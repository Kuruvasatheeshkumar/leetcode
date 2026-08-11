class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list =new ArrayList<>();
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                list.add(matrix[startrow][j]);
            }

            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                 list.add(matrix[i][endcol]);
            }

            //bottom
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startrow==endrow)
                {
                    break;
                }list.add(matrix[endrow][j]);
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol==endcol)
                {
                    break;
                } list.add(matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }return list;
    }
}