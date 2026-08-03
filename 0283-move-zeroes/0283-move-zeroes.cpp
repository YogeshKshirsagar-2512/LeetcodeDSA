class Solution {
public:
    void moveZeroes(vector<int>& nums) {

        for(int i = 0 ; i < nums.size()-1; i++){
            for(int j = 0 ; j < nums.size()-1-i;j++){
                if(nums[j] == 0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
};