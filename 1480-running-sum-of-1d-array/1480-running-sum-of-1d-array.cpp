class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sum_runs(nums.size());

        int sum = 0 ; 
        for(int i = 0  ; i < nums.size(); i++){
            sum_runs[i] = sum +=nums[i];
        }
        return sum_runs;
    }
};