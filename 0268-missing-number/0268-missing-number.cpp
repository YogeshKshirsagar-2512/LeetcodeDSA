class Solution {
public:
    int missingNumber(vector<int>& nums) {

        int n = nums.size();
        long sum = (n * (n+1))/2;
        int vector_sum = 0;
        for(int ele : nums){
            vector_sum += ele;
        }
        return sum - vector_sum;
    }
};