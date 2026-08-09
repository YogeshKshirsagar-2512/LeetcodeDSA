class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int col = matrix[0].size()-1;

        vector<vector<int>> ans(n,vector<int>(n));
        for(int i = 0 ; i < matrix.size(); i++){

            for(int j = 0 ; j < matrix[0].size(); j++){
                ans[j][col] = matrix[i][j];
            }
            col--;
        }
        for(int i = 0 ; i < ans.size(); i++){
            for(int j =  0 ; j <ans[0].size(); j++){
                matrix[i][j] = ans[i][j];
            }
        }
        
    }
};