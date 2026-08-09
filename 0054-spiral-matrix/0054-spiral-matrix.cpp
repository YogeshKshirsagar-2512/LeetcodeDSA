class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans ;

        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.size()-1;
        int end_col = matrix[0].size()-1;

        while(start_row <= end_row && start_col <= end_col){
            for(int j = start_col ; j <= end_col; j++){
                ans.push_back(matrix[start_row][j]);
            }

            for(int i = start_row+1; i <= end_row ; i++){
                ans.push_back(matrix[i][end_col]);
            }

            if(start_row != end_row){
                for(int j = end_col -1 ; j >= start_col ; j--){
                    ans.push_back(matrix[end_row][j]);
                }
            }
            if(start_col != end_col){
                for(int i = end_row-1 ; i >= start_row+1; i--){
                    ans.push_back(matrix[i][start_col]);
                }


            }

            start_row++;
            end_row--;
            end_col--;
            start_col++;
        }

        return ans;
        
        
    }
};