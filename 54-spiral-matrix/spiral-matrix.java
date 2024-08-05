class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        int col1 = 0 , row1 = 0;
        int col2 = matrix[0].length-1 , row2 = matrix.length-1;
        List<Integer> list = new ArrayList<>();
        while(row1 <= row2 && col1 <= col2){
            for(int i = col1 ; i <= col2 ; i++){
                list.add(matrix[row1][i]);
            }
            for(int i = row1+1 ; i <= row2 ; i++){
                list.add(matrix[i][col2]);
            }
            if(row1<row2 && col1<col2){
                for(int i = col2-1 ; i >= col1 ; i--){
                    list.add(matrix[row2][i]);
                }
                for(int i = row2-1 ; i >= row1+1 ; i--){
                    list.add(matrix[i][col1]);
                }
            }
            col1++;
            col2--;
            row1++;
            row2--;


        }return list;  
    }
}