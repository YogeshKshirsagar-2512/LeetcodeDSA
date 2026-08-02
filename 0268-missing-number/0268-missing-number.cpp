class Solution {
public:
    int missingNumber(vector<int>& nums) {

        // int n = nums.size();
        // long sum = (n * (n+1))/2;
        // int vector_sum = 0;
        // for(int ele : nums){
        //     vector_sum += ele;
        // }
        // return sum - vector_sum;

        vector<bool> flag(nums.size()+1, false);
        for(int i = 0 ; i < nums.size(); i++){
            flag[nums[i]] = true;
        }
        for(int i =  0 ; i < flag.size(); i++){
            if(flag[i] == false){
                return i;
            }
        }
        return nums.size();

    }
};