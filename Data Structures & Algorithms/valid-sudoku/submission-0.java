class Solution {
    public boolean isValidSudoku(char[][] board) {
        //am 9 linii, 9 subBox uri si 9 coloane -> array de tip set de dim 9
       Set<Character>[] row = new HashSet[9];
       Set<Character>[] column = new HashSet[9]; 
       Set<Character>[] subBox= new HashSet[9];
//init
       for(int i=0;i<9;++i)
       {
        row[i]=new HashSet<>();
        column[i]=new HashSet<>();
        subBox[i]=new HashSet<>();
       }

       for(int r=0;r<9;++r)
       {
        for(int c=0;c<9;++c)
        {
            if(board[r][c]=='.')
            {
                continue;
            }
            int boxIndex=(r/3)*3+c/3;
            if(row[r].contains(board[r][c]) || column[c].contains(board[r][c]) 
            || subBox[boxIndex].contains(board[r][c]))
            {
                return false;
            }
            
            row[r].add(board[r][c]);
            column[c].add(board[r][c]);
            subBox[boxIndex].add(board[r][c]);
        }
       }
       return true;
    }
}
