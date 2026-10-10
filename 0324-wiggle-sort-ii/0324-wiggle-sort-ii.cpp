class Solution {
public:
    void wiggleSort(vector<int>& nums) {
        vector<int> sorted = nums;
        sort(sorted.begin(), sorted.end());
        int left = (sorted.size()-1)/2;
        int right = sorted.size()-1;

        for(int i = 0 ; i < nums.size(); i++){
            if(i % 2 == 0) nums[i] = sorted[left--];
            else nums[i] = sorted[right--];
        }
    }
};