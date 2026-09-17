class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer>r=new HashSet<>();
        HashSet<Integer>c=new HashSet<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(r.contains(i)||c.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}