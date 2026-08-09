class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> matrix(n,vector<int>(n,0));
        int min_row = 0;
        int min_col = 0;
        int max_row = matrix.size()-1;
        int max_col = matrix[0].size()-1;
        int number = 1;

        while(min_row <= max_row && min_col <= max_col){
            for(int j = min_col ; j <= max_col ; j++  ){
                matrix[min_row][j] = number++;
            }
            
            for(int i = min_row+1 ; i <= max_row ; i++){
                matrix[i][max_col] = number++;
            }
            
            if(min_row < max_row){ 
            for(int j = max_col-1 ; j >= min_col ; j--){
             matrix[max_row][j] = number++;
            }
            }
            
            if(min_col < max_col){ 
            for(int i = max_row-1 ; i >= min_row+1; i--){
            matrix[i][min_col] = number++;
            }
            }
            min_col++;
            min_row++;
            max_col--;
            max_row--;
        }
        return matrix;
    }
};