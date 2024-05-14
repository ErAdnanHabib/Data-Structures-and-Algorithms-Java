class Solution {
    public boolean exist(char[][] board, String word) {
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(dfs(board,word,r,c,0))return true;
            }
        } return false;
    }
    public boolean dfs(char[][] board, String word, int row, int col, int curr){
        if(word.length()==curr)return true;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]=='#')return false;
        char ch =board[row][col];
        if(word.charAt(curr) != ch)return false;
        board[row][col]='#';
        boolean top= dfs(board,word,row-1,col,curr+1);
        boolean left= dfs(board,word,row,col-1,curr+1);
        boolean bottom= dfs(board,word,row+1,col,curr+1);
        boolean right= dfs(board,word,row,col+1,curr+1);
        board[row][col]=ch;
        return top || left || right || bottom;
    }
}