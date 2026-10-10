class Solution {
    public boolean canplace(char [][]board,int r, int c,char n)
    {
        for(int i=0;i<9;i++)
        {
            if(i != c && board[r][i]==n)
            {
                return false;
            }
            if(i != r && board[i][c]==n)
            {
                return false;
            }
            int boxrow=3*(r/3)+(i/3);
            int boxcol=3*(c/3)+(i%3);
            if((boxrow != r || boxcol != c) && board[boxrow][boxcol]==n)
            {
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int r=0;r<board.length;r++)
        {
            for(int c=0;c<board.length;c++)
            {
                if(board[r][c]=='.')
                {
                    continue;
                }
                else
                {
                    char n=board[r][c]; 
                    if(!canplace(board,r,c,n))
                        {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        
    }