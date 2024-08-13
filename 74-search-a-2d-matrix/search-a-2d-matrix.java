class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix[0].length ; i++){
            for(int j=0;j<matrix.length ; j++){
                if(matrix[j][i]==target){
                    return true;
                }
            }
        }return false;
    }
}