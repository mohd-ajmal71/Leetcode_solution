class Solution {
    public boolean isSafe(char board[][],int row,int col)
    {
        //horizontal
        for(int i=0;i<board.length;i++)
        {
          if(board[row][i]=='Q')
           {
             return false;
           }
        }
        //vertical
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        //top left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }

        //top right
        r=row;
        for(int c=col;c<board.length && r>=0;c++,r--)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }
        //bottom left
        int c=col;
        for(r=row;r<board.length && c>=0;c--,r++)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }
        // bottom right
        c=col;
        for(r=row;r<board.length && c<board.length;r++,c++)
        {
            if(board[r][c]=='Q')
            {
             return false;
            }
        }

        return true;



    }

    public void saveBoard(List<List<String>> allBoard,char board[][])
    {
        List<String> newBoard=new ArrayList<>();
        String row="";
        for(int i=0;i<board.length;i++)
        {
            row="";
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='Q')
                {
                    row+='Q';
                }
                else
                {
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }
    public void helper(List<List<String>> allBoard,char board[][],int col)
    {
        if(col==board.length)
        {
            saveBoard(allBoard,board);
            return ;
        }
        for(int row=0;row<board.length;row++)
        {
            if(isSafe(board,row,col))
            {

                board[row][col]='Q';
                helper(allBoard,board,col+1);
                board[row][col]='.';

            }

        }
    }
    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> allBoard=new ArrayList<>();
        char board [][]=new char[n][n];
        helper(allBoard,board,0);

        return allBoard;

        
    }
}