class Solution {
    public void setZeroes(int[][] matrix) {
        boolean hasRowZero=false,hasColZero=false;
        
        for(int c=0;c<matrix[0].length;c++){
            if(matrix[0][c]==0){
                hasRowZero=true; 
                break;  
            }
        }
        for(int r=0;r<matrix.length;r++){
            if(matrix[r][0]==0){
                hasColZero=true;
                break;
            }
        }
        // ----------------------------------------------
        for(int r=1;r<matrix.length;r++){
            for(int c=1;c<matrix[0].length;c++){
                if(matrix[r][c]==0){
                    matrix[r][0]=0;
                    matrix[0][c]=0;
                }
            }
        }
        // ----------------------------------------------
        // now we will nullify the whole row and column
        for(int r=1;r<matrix.length;r++){
            if(matrix[r][0]==0){
                nullifyRow(matrix,r);
            }
        }
        for(int c=1;c<matrix[0].length;c++){
            if(matrix[0][c]==0){
                nullifyCol(matrix,c);
            }
        }
        if(hasRowZero) nullifyRow(matrix,0);
        if(hasColZero) nullifyCol(matrix,0);
    }

    public void nullifyRow(int[][] matrix, int row){
        for(int c=0;c<matrix[0].length;c++){
            matrix[row][c]=0;
        }
    }
    public void nullifyCol(int[][] matrix, int col){
        for(int r=0;r<matrix.length;r++){
            matrix[r][col]=0;
        }
    }
}