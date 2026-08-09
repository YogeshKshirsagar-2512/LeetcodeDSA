class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int min_row = 0;
        int min_col = 0;
        int max_row = matrix.length-1;
        int max_col = matrix[0].length-1;

        while(min_row <= max_row && min_col <= max_col){
            for(int j = min_col ; j <= max_col ; j++  ){
                result.add(matrix[min_row][j]);
            }
            
            for(int i = min_row+1 ; i <= max_row ; i++){
                result.add(matrix[i][max_col]);
            }
            
            if(min_row < max_row){ 
            for(int j = max_col-1 ; j >= min_col ; j--){
                result.add(matrix[max_row][j]);
            }
            }
            
            if(min_col < max_col){ 
            for(int i = max_row-1 ; i >= min_row+1; i--){
                result.add(matrix[i][min_col]);
            }
            }
            min_col++;
            min_row++;
            max_col--;
            max_row--;
        }
        return result;
    }
}