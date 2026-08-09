#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int row_dim = matrix.size();
        int col_dim = matrix[0].size();
        vector<vector<int>> ans(col_dim, vector<int>(row_dim));

        for(int i = 0 ; i < matrix.size() ; i++){
            for(int j = 0 ; j < matrix[0].size() ; j++){
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;

        // for(int i = 1; i < matrix.size() ; i++){
        //     for(int j = 0 ; j < i ; j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }
        // return matrix;
     

    }
};