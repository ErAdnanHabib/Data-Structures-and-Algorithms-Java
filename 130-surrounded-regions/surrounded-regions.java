class Solution {
    public void solve(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if((r==0 || r==row-1 || c==0 || c==col-1) && board[r][c]=='O'){
                    dfs(board,r,c);
                }
            }
        }
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(board[r][c]=='O'){
                    board[r][c]='X';
                } else if(board[r][c]=='#'){
                    board[r][c]='O';
                }
            }
        }  
    }
    public static void dfs(char[][] board, int r, int c){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!='O')return;
        board[r][c]='#';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);
    }
}