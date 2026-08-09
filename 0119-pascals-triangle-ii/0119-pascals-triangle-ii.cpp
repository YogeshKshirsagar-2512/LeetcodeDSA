#include<vector>
using namespace std;

class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<vector<int>> ans;
        vector<int> result;
        for(int i = 1 ; i <= rowIndex+1; i++){
            ans.push_back(vector<int>(i,1));
        }
        for(int i = 2 ; i < ans.size(); i++){
            for(int j = 1 ; j < ans[i].size()-1 ; j++){
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }

        for(int j = 0 ; j < ans[rowIndex].size() ; j++){
            result.push_back(ans[rowIndex][j]);
        }
        return result;

    }
};