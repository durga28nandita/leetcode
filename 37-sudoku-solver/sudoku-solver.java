class Solution {
    public static boolean canplace(char[][] board,int r,int c,int n)
    {
        for(int i=0;i<=8;i++)
        {
            if(board[r][i]==n)
            {
                return false;
            }
            if(board[i][c]==n)
            {
                return false;
            }
            int boxrow=3*(r/3)+i/3;
            int boxcol=3*(c/3)+i%3;
            if(board[boxrow][boxcol]==n)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean solve(char[][] board)
    //find empty cell
    {for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                //if we find empty cell
                if(board[r][c]=='.')
                {
                    //checkn from 1 to 9 which fits there
                    for(char n='1';n<='9';n++)
                    {
                        if(canplace(board,r,c,n))
                        {
                            board[r][c]=n;
                            //explore for remaining cells
                            if(solve(board))
                            {
                                return true;//if board is solved , return true at every recursive step
                            }
                            board[r][c]='.';//the number we placed is not correct , check next
                        }
                    }
                    return false;//1 to 9 we cannot fix any number 
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}