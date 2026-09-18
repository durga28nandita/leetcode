class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer>res=new ArrayList<>();
        int l=0;
        int r=n-1;
        int t=0;
        int b=m-1;
        while(l<=r && t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                res.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                res.add(matrix[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    res.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    res.add(matrix[i][l]);
                }
            }
            l++;
    }
    return res;
    }
}