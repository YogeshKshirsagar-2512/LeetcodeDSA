class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n = nums.size();
        
       
        int i = 0;
        int j = 0;
        int count = 0;
        int maxcount = INT_MIN;
        while(j < n){
            if(nums[j] == 1) {
                count++;
                j++;
            }
            else if(nums[j] == 0){
                if(maxcount < count) maxcount = count;
                i = j; 
                j++;
                count = 0;

            }

        }

                        if(maxcount < count) maxcount = count;
      
            

        return maxcount;

    }
};