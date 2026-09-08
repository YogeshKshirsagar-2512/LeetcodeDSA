class Solution {
public:
    vector<int> twoSum(vector<int>& v, int target) {
        vector<int> ans(2,0);
        for(int i = 0; i < v.size(); i++){
            for(int j = i+1 ; j < v.size(); j++){
                if((v[i] + v[j])== target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans ;
    }
};